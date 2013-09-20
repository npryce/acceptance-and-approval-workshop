package exercise.pearlfish;

import com.natpryce.pearlfish.adaptor.junit.ApprovalRule;
import com.natpryce.pearlfish.naming.SingleDirectoryNamingConvention;
import exercise.*;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.natpryce.pearlfish.formats.TemplateFormats.SVG;

public class PearlfishDataFittingTest {
    @Rule
    public ApprovalRule<Object> approval = new ApprovalRule<Object>(
            SVG.withTemplateFile("test/exercise/pearlfish/datafit.svg.template"),
            SingleDirectoryNamingConvention.forDirectory("reports/pearlfish"));

    @Test
    public void fittingDataSetA() throws IOException {
        final List<Point> sample = DataSets.sampleDataSetA(0, 200);
        final Polynomial polynomial = DataFitting.fitCurveForDataSourceA(sample);

        approval.check(new Object() {
            public String dataSet = "A";
            public List<Point> data = sample;
            public Polyline trend = polynomial.segment(0, 1000);
        });
    }
}
