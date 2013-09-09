package exercise.pearlfish;

import com.natpryce.pearlfish.adaptor.junit.ApprovalRule;
import exercise.Algorithms;
import exercise.DataSets;
import exercise.Point;
import exercise.Polynomial;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.natpryce.pearlfish.formats.TemplateFormats.SVG;

public class PearlfishDataFittingTest {
    @Rule
    public ApprovalRule<Object> approval = new ApprovalRule<Object>("test", SVG.withTemplate(new File("test/exercise/pearlfish/datafit.svg.template")));

    @Test
    public void fittingDataSetA() throws IOException {
        checkAlgorithm("aardvark", DataSets.dataSetA(1));
    }

    public void checkAlgorithm(String algorithmName, final List<Point> dataSet) throws IOException {
        final Polynomial trendLine = Algorithms.byName(algorithmName).apply(dataSet);
        assert trendLine != null;

        approval.check(new Object() {
            public List<Point> data = dataSet;
            public Object trend = trendLine.segment(0, 1000);
        });
    }
}
