package exercise.test;

import exercise.DataSets;
import exercise.Point;

import java.util.List;

public class DataSetA1FittingTest extends AbstractDataFittingTest {
    @Override
    protected List<Point> dataSet() {
        return DataSets.sampleDataSetA(0, 200);
    }
}
