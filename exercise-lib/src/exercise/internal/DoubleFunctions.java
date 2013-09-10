package exercise.internal;

import exercise.DoubleFunction;
import exercise.Point;

import java.util.List;

public class DoubleFunctions {
    public static <T> DoubleFunction<T> mul(final DoubleFunction<T> f1, final DoubleFunction<T> f2) {
        return new DoubleFunction<T>() {
            @Override
            public double of(T p) {
                return f1.of(p) * f2.of(p);
            }
        };
    }

    public static <T> DoubleFunction<T> sq(final DoubleFunction<T> f) {
        return new DoubleFunction<T>() {
            @Override
            public double of(T p) {
                double v = f.of(p);
                return v * v;
            }
        };
    }

    public static <T> DoubleFunction<T> pow(final DoubleFunction<T> f1, final double power) {
        return new DoubleFunction<T>() {
            @Override
            public double of(T p) {
                return Math.pow(f1.of(p), power);
            }
        };
    }

    public static <T> double reduceSum(DoubleFunction<T> f, List<T> values) {
        double total = 0;
        for (T v : values) {
            total += f.of(v);
        }
        return total;
    }

    @SafeVarargs
    public static <T> double reduceMin(DoubleFunction<T> f, T first, T second, T... more) {
        double min = Math.min(f.of(first), f.of(second));
        for (T t : more) {
            min = Math.min(min, f.of(t));
        }
        return min;
    }

    @SafeVarargs
    public static <T> double reduceMax(DoubleFunction<T> f, T first, T second, T... more) {
        double max = Math.max(f.of(first), f.of(second));
        for (T t : more) {
            max = Math.max(max, f.of(t));
        }
        return max;
    }

    public static double reduceAvg(DoubleFunction<Point> fn, List<Point> points) {
        return reduceSum(fn, points) / points.size();
    }
}
