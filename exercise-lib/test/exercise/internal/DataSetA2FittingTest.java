package exercise.internal;

import exercise.DataSets;
import exercise.Point;

import java.util.ArrayList;

public class DataSetA2FittingTest extends AbstractDataFittingTest {
    @Override
    protected ArrayList<Point> dataSet() {
        return DataSets.dataSetA(2);
    }
}
