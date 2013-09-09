package exercise.cucumber;

import com.google.common.collect.Lists;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import exercise.Point;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class DataFittingTest {
    List<Point> points = Lists.newArrayList();

    @Given("data point (.+)\\s*,\\s*(.+)")
    public void givenDataPoint(double x, double y) {
        points.add(new Point(x,y));
    }

    @When("(.+) algorithm applied")
    public void algorithmApplied(String algorithmName) {
        
    }

}
