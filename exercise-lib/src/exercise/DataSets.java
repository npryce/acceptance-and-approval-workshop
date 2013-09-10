package exercise;

import exercise.internal.PolynomialDataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.google.common.collect.Iterables.limit;
import static com.google.common.collect.Lists.newArrayList;

public class DataSets {
    public static List<Point> dataSetA(int dataSetIndex) {
        Random rng = new Random(dataSetIndex);
        return take(100, new PolynomialDataSource(rng, new Polynomial(100,0.5), 50, 0, 1000));
    }

    public static List<Point> dataSetB(int dataSetIndex) {
        Random rng = new Random(dataSetIndex);
        return take(100, new PolynomialDataSource(rng, new Polynomial(250, -0.5, 0.00125, -0.00000005), 50, 0, 1000));
    }

    private static List<Point> take(int limitSize, Iterable<Point> dataset) {
        return newArrayList(limit(dataset, limitSize));
    }
}
