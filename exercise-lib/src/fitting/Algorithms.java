package fitting;

import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import static com.google.common.collect.Sets.newTreeSet;
import static fitting.Point.X;
import static fitting.Point.by;

public class Algorithms {
    public static Polynomial aardvark(List<Point> points) {
        return lineBetweenRandomElements(points, 1);
    }

    public static Polynomial baboon(List<Point> points) {
        TreeSet<Point> sortedPoints = newTreeSet(by(X));
        sortedPoints.addAll(points);
        return Polynomial.lineBetween(sortedPoints.first(), sortedPoints.last());
    }

    public static Polynomial coatimundi(List<Point> points) {
        return lineBetweenRandomElements(points, 2);
    }

    public static Polynomial donkey(List<Point> points) {
        return DataFitting.linearFit(points);
    }

    public static Polynomial elephant(List<Point> points) {
        return lineBetweenRandomElements(points, 3);
    }

    public static Polynomial foxbat(List<Point> points) {
        return DataFitting.polynomialFit(points, 2);
    }

    public static Polynomial gibbon(List<Point> points) {
        return DataFitting.polynomialFit(points, 3);
    }

    private static Polynomial lineBetweenRandomElements(List<Point> points, long seed) {
        Random rng = new Random(seed);
        return Polynomial.lineBetween(randomElement(points, rng), randomElement(points, rng));
    }

    private static Point randomElement(List<Point> points, Random rng) {
        return points.get(rng.nextInt(points.size()));
    }
}
