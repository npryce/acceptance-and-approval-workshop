package exercise.test;

import exercise.DataSets;
import exercise.Point;

import java.util.List;

public class DataSetA2FittingTest extends AbstractDataFittingTest {
    @Override
    protected List<Point> dataSet() {
        return DataSets.dataSetA(2);
    }
}