package data;

import fitting.Point;
import fitting.Polynomial;

import java.util.ArrayList;
import java.util.Random;

import static com.google.common.collect.Iterables.limit;
import static com.google.common.collect.Lists.newArrayList;

public class DataSets {

    public static ArrayList<Point> dataSet1() {
        Random rng = new Random(1L);
        return take(100, new PolynomialDataSource(rng, new Polynomial(100,0.5), 50, 0, 1000));
    }

    public static ArrayList<Point> dataSet2(int minX, int maxX) {
        Random rng = new Random(1L);
        return take(100, new PolynomialDataSource(rng, new Polynomial(250, -0.5, 0.00125, -0.00000005), 50, minX, maxX));
    }

    public static ArrayList<Point> take(int limitSize, Iterable<Point> dataset) {
        return newArrayList(limit(dataset, limitSize));
    }
}
