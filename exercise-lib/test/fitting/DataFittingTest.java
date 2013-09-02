package fitting;

import com.natpryce.pearlfish.adaptor.junit.ApprovalRule;
import data.DataSets;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.natpryce.pearlfish.formats.Formats.SVG;

public class DataFittingTest {
    @Rule
    public ApprovalRule<Object> approval = new ApprovalRule<Object>("test", SVG);

    @Test
    public void fitLinearRandomData() throws IOException {
        final List<Point> points = DataSets.dataSourceA(1);

        // This is what we're testing...
        final Polynomial trendLine = Algorithms.donkey(points);

        approval.check(new Object() {
            public List<Point> data = points;
            public Object trend = new Object() {
                public Point p0 = trendLine.atX(0);
                public Point p1 = trendLine.atX(1000);
            };
        });
    }

    @Test
    public void fitQuadraticRandomData() throws IOException {
        final int minX = 0;
        final int maxX = 1000;
        final List<Point> points = DataSets.dataSourceB(1);

        // This is what we're testing...
        final Polynomial trendLine = Algorithms.foxbat(points);

        approval.check(new Object() {
            public List<Point> data = points;
            public Object trend = new Object() {
                public Point p0 = trendLine.atX(minX);
                public Point p1 = trendLine.atX(maxX);
            };
        });
    }
}
