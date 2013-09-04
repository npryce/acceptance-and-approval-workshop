package exercise.internal;

import Jama.Matrix;
import exercise.Point;
import exercise.Polynomial;

import java.util.List;

import static exercise.Point.X;
import static exercise.Point.Y;
import static exercise.internal.DoubleFunctions.*;

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
        int dim = degree+1;

        Matrix a = new Matrix(dim, dim);
        Matrix b = new Matrix(dim, 1);

        for (int row = 0; row < dim; row++) {
            for (int col = 0; col < dim; col++) {
                a.set(row, col, sum(pow(X, row + col), points));
            }

            b.set(row, 0, sum(mul(pow(X,row),Y), points));
        }

        Matrix x = a.inverse().times(b);

        double[] coefficients = new double[dim];
        for (int row = 0; row < dim; row++) {
            coefficients[row] = x.get(row, 0);
        }

        return new Polynomial(coefficients);
    }
}
