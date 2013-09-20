package exercise.test;

import exercise.DataSets;
import exercise.Point;

import java.util.List;

public class DataSetB1FittingTest extends AbstractDataFittingTest {
    @Override
    protected List<Point> dataSet() {
        return DataSets.sampleDataSetB(0, 200);
    }
}
