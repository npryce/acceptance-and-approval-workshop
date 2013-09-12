package exercise;

import exercise.internal.PolynomialDataSource;

import java.util.List;

import static exercise.internal.Functional.take;

public class DataSets {
    public static List<Point> sampleDataSourceA(int dataSetIndex) {
        return take(200, new PolynomialDataSource(dataSetIndex, new Polynomial(100, 0.5), 50, 0, 1000));
    }

    public static List<Point> sampleDataSourceB(int dataSetIndex) {
        return take(200, new PolynomialDataSource(dataSetIndex, new Polynomial(250, -0.5, 0.00125, -0.00000005), 50, 0, 1000));
    }
}
