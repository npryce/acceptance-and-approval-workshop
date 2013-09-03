package exercise;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static exercise.Point.X;
import static exercise.Point.Y;
import static exercise.internal.DoubleFunctions.max;
import static exercise.internal.DoubleFunctions.min;
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
        double minX = min(X, p1, p2);
        double maxX = max(X, p1, p2);
        double minY = min(X, p1, p2);
        double maxY = max(Y, p1, p2);

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
        return new Polyline(_segment(minX, maxX));
    }

    private List<Point> _segment(double minX, double maxX) {
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
}
