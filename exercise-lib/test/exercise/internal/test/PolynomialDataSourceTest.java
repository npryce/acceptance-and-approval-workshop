package exercise.internal.test;

import exercise.Point;
import exercise.Polynomial;
import exercise.internal.PolynomialDataSource;
import org.junit.Test;

import static exercise.internal.Functional.take;
import static org.junit.Assert.assertTrue;

public class PolynomialDataSourceTest {
    @Test
    public void twoIdenticalDataSourcesGenerateIdenticalStreams() {
        long start = 0;
        PolynomialDataSource d1 = new PolynomialDataSource(new Polynomial(1,-2,3), 2.0, 0.0, 1000.0, start);
        PolynomialDataSource d2 = new PolynomialDataSource(new Polynomial(1,-2,3), 2.0, 0.0, 1000.0, start);

        for (int i = 0; i < 100; i++) {
            Point p1 = d1.next();
            Point p2 = d2.next();
            assertTrue("point " + i + ": " + p1 + " == " + p2 + "?", p1.equals(p2));
        }
    }

    @Test
    public void afterDifferentStartingPointsTwoIdenticalDataSourcesGenerateIdenticalStreams() {
        PolynomialDataSource d1 = new PolynomialDataSource(new Polynomial(1,-2,3), 2.0, 0.0, 1000.0, 0);
        PolynomialDataSource d2 = new PolynomialDataSource(new Polynomial(1,-2,3), 2.0, 0.0, 1000.0, 5);

        take(5, d1);

        for (int i = 0; i < 100; i++) {
            Point p1 = d1.next();
            Point p2 = d2.next();
            assertTrue("point " + (i+5) + ": " + p1 + " == " + p2 + "?", p1.equals(p2));
        }
    }
}
