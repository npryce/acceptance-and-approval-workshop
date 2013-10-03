package exercise.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import exercise.DataFitting;
import exercise.Point;
import exercise.Polynomial;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DataFittingSteps {
    private Polynomial curve = null;

    @Given("data points from source (.+)")
    public void dataPointsFromSource(String sourceName, List<Point> points) {
        if (sourceName.equalsIgnoreCase("A")) {
            curve = DataFitting.curveForDataSetA(points);
        }
        else if (sourceName.equalsIgnoreCase("B")) {
            curve = DataFitting.curveForDataSetB(points);
        }
        else {
            throw new IllegalArgumentException("unknown data source: " + sourceName);
        }
    }

    @Then("best fit is (.+)")
    public void fitPoints(String curveAsString) {
        assert curve != null;

        assertThat(curve.toString(), equalTo(curveAsString));
    }
}
