package exercise.test;

import com.natpryce.pearlfish.adaptor.junit.ApprovalRule;
import com.natpryce.pearlfish.formats.TemplateFormats;
import exercise.Algorithms;
import exercise.Point;
import exercise.Polynomial;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
public abstract class AbstractDataFittingTest {
    @Rule
    public ApprovalRule<Object> approval = new ApprovalRule<Object>("test", TemplateFormats.SVG.withTemplate("datafit.svg.template"));

    @Test
    public void checkAardvarkAlgorithm() throws IOException {
        checkAlgorithm("aardvark");
    }

    @Test
    public void checkBaboonAlgorithm() throws IOException {
        checkAlgorithm("baboon");
    }

    @Test
    public void checkCoatimundiAlgorithm() throws IOException {
        checkAlgorithm("coatimundi");
    }

    @Test
    public void checkDonkeyAlgorithm() throws IOException {
        checkAlgorithm("donkey");
    }

    @Test
    public void checkElephantAlgorithm() throws IOException {
        checkAlgorithm("elephant");
    }

    @Test
    public void checkFoxbatAlgorithm() throws IOException {
        checkAlgorithm("foxbat");
    }

    @Test
    public void checkGibbonAlgorithm() throws IOException {
        checkAlgorithm("gibbon");
    }

    @Test
    public void checkHippopotamusAlgorithm() throws IOException {
        checkAlgorithm("hippopotamus");
    }

    private void checkAlgorithm(String algorithmName) throws IOException {
        final List<Point> points = dataSet();
        final Polynomial trendLine = Algorithms.byName(algorithmName).apply(points);

        assert trendLine != null;

        approval.check(new Object() {
            public List<Point> data = points;
            public Object trend = trendLine.segment(0, 1000);
        });
    }

    protected abstract List<Point> dataSet();
}
