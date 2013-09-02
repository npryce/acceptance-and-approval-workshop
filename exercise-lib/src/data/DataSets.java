package data;

import fitting.Point;
import fitting.Polynomial;

import java.util.ArrayList;
import java.util.Random;

import static com.google.common.collect.Iterables.limit;
import static com.google.common.collect.Lists.newArrayList;

public class DataSets {
    public static ArrayList<Point> dataSourceA(int dataSetIndex) {
        Random rng = new Random(dataSetIndex);
        return take(100, new PolynomialDataSource(rng, new Polynomial(100,0.5), 50, 0, 1000));
    }

    public static ArrayList<Point> dataSourceB(int dataSetIndex) {
        Random rng = new Random(dataSetIndex);
        return take(100, new PolynomialDataSource(rng, new Polynomial(250, -0.5, 0.00125, -0.00000005), 50, 0, 1000));
    }

    public static ArrayList<Point> take(int limitSize, Iterable<Point> dataset) {
        return newArrayList(limit(dataset, limitSize));
    }
}
