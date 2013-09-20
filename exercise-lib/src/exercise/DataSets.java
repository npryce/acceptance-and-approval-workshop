package exercise;

import exercise.internal.PolynomialDataSource;

import java.util.List;

import static exercise.internal.Functional.take;

public class DataSets {
    public static List<Point> sampleDataSetA(int start, int count) {
        Polynomial polynomial = new Polynomial(100, 0.5);
        return take(count, new PolynomialDataSource(polynomial, 50, 0, 1000, start));
    }

    public static List<Point> sampleDataSetB(int start, int count) {
        Polynomial polynomial = new Polynomial(250, -0.5, 0.00125, -0.00000005);
        return take(count, new PolynomialDataSource(polynomial, 50, 0, 1000, start));
    }
}
