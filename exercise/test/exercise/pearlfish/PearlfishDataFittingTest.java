package exercise.pearlfish;

import com.natpryce.pearlfish.adaptor.junit.ApprovalRule;
import com.natpryce.pearlfish.naming.NextToSourceNamingConvention;
import com.natpryce.pearlfish.naming.SingleDirectoryNamingConvention;
import exercise.*;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.natpryce.pearlfish.formats.TemplateFormats.MARKDOWN;
import static com.natpryce.pearlfish.formats.TemplateFormats.SVG;

public class PearlfishDataFittingTest {
    @Rule
    public ApprovalRule<Object> approval = new ApprovalRule<Object>(
            SVG.withTemplateFile("test/exercise/pearlfish/datafit.svg.template"),
            SingleDirectoryNamingConvention.forDirectory("reports/pearlfish"));

    @Test
    public void fittingDataSetA() throws IOException {
        final List<Point> sample = DataSets.sampleDataSourceA(1);
        final Polynomial polynomial = DataFitting.fitCurveForDataSourceA(sample);

        approval.check(new Object() {
            public String dataSource = "A";
            public List<Point> data = sample;
            public Polyline trend = polynomial.segment(0, 1000);
        });
    }
}
