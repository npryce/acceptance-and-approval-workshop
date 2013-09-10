package exercise;

import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static exercise.Point.X;
import static exercise.Point.Y;
import static exercise.internal.DoubleFunctions.reduceMax;
import static exercise.internal.DoubleFunctions.reduceMin;
import static java.util.Arrays.asList;

public class Polynomial {
    private final double[] coefficients;

    /**
     * @param coefficients the coefficients of the polynomial:
     *                     coefficients.length > 0 && coefficients[coefficients.length-1] != 0;
     */
    public Polynomial(double... coefficients) {
        assert coefficients.length > 0;
        assert coefficients[coefficients.length-1] != 0;

        this.coefficients = coefficients;
    }

    public static Polynomial lineBetween(Point p1, Point p2) {
        double minX = reduceMin(X, p1, p2);
        double maxX = reduceMax(X, p1, p2);
        double minY = reduceMin(X, p1, p2);
        double maxY = reduceMax(Y, p1, p2);

        double deltaX = maxX - minX;
        double deltaY = maxY - minY;

        double b = deltaY/deltaX;
        double a = minY - b*minX;

        return new Polynomial(a, b);
    }

    public int degree() {
        return coefficients.length - 1;
    }

    public Point atX(double x) {
        double y = 0;

        for (int i = 0; i < coefficients.length; i++) {
            y += coefficients[i] * Math.pow(x, i);
        }

        return new Point(x, y);
    }

    public Polyline segment(double minX, double maxX) {
        return new Polyline(toListOfPointsBetween(minX, maxX));
    }

    private List<Point> toListOfPointsBetween(double minX, double maxX) {
        if (degree() <= 1) {
            return asList(atX(minX), atX(maxX));
        }
        else {
            List<Point> points = newArrayList();
            for (double x = minX; x <= maxX; x += 1.0) {
                points.add(atX(x));
            }
            return points;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Polynomial that = (Polynomial) o;

        return Arrays.equals(coefficients, that.coefficients);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coefficients);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(coefficients[0]);
        for (int i = 1; i < coefficients.length; i++) {
            double n = coefficients[i];
            if (n == 0) continue;

            b.append(" ").append(n < 0 ? "-" : "+").append(" ").append(Math.abs(n)).append("*x");
            if (i > 1) b.append("**").append(i);
        }
        return b.toString();
    }
}
