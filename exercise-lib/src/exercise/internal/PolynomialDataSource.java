package exercise.internal;

import exercise.Point;
import exercise.Polynomial;

import java.util.Iterator;
import java.util.Random;

public class PolynomialDataSource implements Iterable<Point>, Iterator<Point> {
    private final Random rng;
    private final Polynomial polynomial;
    private final double maxJitter;
    private final double minX;
    private final double xRange;

    private long count;


    public PolynomialDataSource(Polynomial polynomial, double maxJitter, double minX, double maxX, long start) {
        this.rng = new Random();
        this.polynomial = polynomial;
        this.maxJitter = maxJitter;
        this.minX = minX;
        this.xRange = maxX - minX;
        this.count = start;
    }

    @Override
    public Iterator<Point> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    public Point next() {
        rng.setSeed(count++ * polynomial.hashCode());
        return jitter(polynomial.atX(minX + rng.nextDouble() * xRange));
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private Point jitter(Point point) {
        double offset = jitterMultiplier(rng) * maxJitter;
        double angle = rng.nextDouble() * Math.PI * 2.0;
        double offsetX = Math.cos(angle) * offset;
        double offsetY = Math.sin(angle) * offset;

        return new Point(point.x +offsetX, point.y +offsetY);
    }

    protected double jitterMultiplier(Random rng) {
        return Math.abs(rng.nextGaussian());
    }

}
