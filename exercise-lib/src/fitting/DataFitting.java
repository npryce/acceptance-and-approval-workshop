package fitting;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import static com.google.common.collect.Sets.newTreeSet;
import static fitting.DoubleFunctions.*;
import static fitting.Point.*;

public class DataFitting {

    /**
     * @param points the points to fit a trend line to
     * @return a Polynomial of degree 1 (i.e. linear)
     */
    public static Polynomial linearFit(List<Point> points) {
        double n = points.size();
        double sumX = sum(X, points);
        double sumY = sum(Y, points);
        double sumXY = sum(mul(X, Y), points);
        double sumXX = sum(sq(X), points);

        double divisor = n * sumXX - sumX * sumX;

        double a = (sumY * sumXX - sumX * sumXY) / divisor;
        double b = (n * sumXY - sumX * sumY) / divisor;

        return new Polynomial(a, b);
    }

    public static Polynomial polynomialFit(List<Point> points, int degree) {
        assert degree >= 1;

        if (degree == 1) {
            return linearFit(points);
        }
        else {
            return solvePolynomialFit(points, degree);
        }
    }

    public static Polynomial solvePolynomialFit(List<Point> points, int degree) {
        throw new UnsupportedOperationException(); // To be done...
    }
}
