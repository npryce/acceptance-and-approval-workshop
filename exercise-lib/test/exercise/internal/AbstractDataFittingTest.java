package exercise.internal;

import com.google.common.base.Function;
import com.natpryce.pearlfish.adaptor.junit.ApprovalRule;
import com.natpryce.pearlfish.formats.TemplateFormats;
import exercise.Algorithms;
import exercise.Point;
import exercise.Polynomial;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
public abstract class AbstractDataFittingTest {
    @Rule
    public ApprovalRule<Object> approval = new ApprovalRule<Object>("test", TemplateFormats.SVG.withTemplate("datafit.svg.template"));

    @Test
    public void checkAardvarkAlgorithm() throws IOException {
        checkAlgorithm(new Function<List<Point>, Polynomial>() {
            @Override
            public Polynomial apply(List<Point> data) {
                return Algorithms.aardvark(data);
            }
        });
    }

    @Test
    public void checkBaboonAlgorithm() throws IOException {
        checkAlgorithm(new Function<List<Point>, Polynomial>() {
            @Override
            public Polynomial apply(List<Point> data) {
                return Algorithms.baboon(data);
            }
        });
    }

    @Test
    public void checkCoatimundiAlgorithm() throws IOException {
        checkAlgorithm(new Function<List<Point>, Polynomial>() {
            @Override
            public Polynomial apply(List<Point> data) {
                return Algorithms.coatimundi(data);
            }
        });
    }

    @Test
    public void checkDonkeyAlgorithm() throws IOException {
        checkAlgorithm(new Function<List<Point>, Polynomial>() {
            @Override
            public Polynomial apply(List<Point> data) {
                return Algorithms.donkey(data);
            }
        });
    }

    @Test
    public void checkElephantAlgorithm() throws IOException {
        checkAlgorithm(new Function<List<Point>, Polynomial>() {
            @Override
            public Polynomial apply(List<Point> data) {
                return Algorithms.elephant(data);
            }
        });
    }

    @Test
    public void checkFoxbatAlgorithm() throws IOException {
        checkAlgorithm(new Function<List<Point>, Polynomial>() {
            @Override
            public Polynomial apply(List<Point> data) {
                return Algorithms.foxbat(data);
            }
        });
    }

    @Test
    public void checkGibbonAlgorithm() throws IOException {
        checkAlgorithm(new Function<List<Point>, Polynomial>() {
            @Override
            public Polynomial apply(List<Point> data) {
                return Algorithms.gibbon(data);
            }
        });
    }

    private void checkAlgorithm(Function<List<Point>, Polynomial> algorithm) throws IOException {
        final List<Point> points = dataSet();
        final Polynomial trendLine = algorithm.apply(points);

        assert trendLine != null;

        approval.check(new Object() {
            public List<Point> data = points;
            public Object trend = trendLine.segment(0, 1000);
        });
    }

    protected abstract ArrayList<Point> dataSet();
}
