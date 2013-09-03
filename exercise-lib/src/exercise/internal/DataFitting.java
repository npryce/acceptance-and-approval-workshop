package exercise.internal;

import exercise.Point;
import exercise.Polynomial;

import java.util.List;

public class DataFitting {

    /**
     * @param points the points to fit a trend line to
     * @return a Polynomial of degree 1 (i.e. linear)
     */
    public static Polynomial linearFit(List<Point> points) {
        double n = points.size();
        double sumX = DoubleFunctions.sum(Point.X, points);
        double sumY = DoubleFunctions.sum(Point.Y, points);
        double sumXY = DoubleFunctions.sum(DoubleFunctions.mul(Point.X, Point.Y), points);
        double sumXX = DoubleFunctions.sum(DoubleFunctions.sq(Point.X), points);

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
        throw new UnsupportedOperationException("polynomial fit of degree " + degree + " not implemented");
    }
}
