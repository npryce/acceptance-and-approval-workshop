package exercise.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.StepDefAnnotation;
import exercise.DataFitting;
import exercise.Point;
import exercise.Polynomial;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DataFittingSteps {
    private List<Point> points = Collections.emptyList();
    private String sourceName;

    @Given("data points from source (.+)")
    public void addDataPoint(String sourceName, List<Point> points) {
        this.sourceName = sourceName;
        this.points = points;
    }

    @Then("best fit is (.+)")
    public void fitPoints(String curve) {
        assertThat(fitCurveToDataSource().toString(), equalTo(curve));
    }

    private Polynomial fitCurveToDataSource() {
        if (sourceName.equalsIgnoreCase("A")) {
            return DataFitting.fitCurveForDataSourceA(points);
        }
        else if (sourceName.equalsIgnoreCase("B")) {
            return DataFitting.fitCurveForDataSourceB(points);
        }
        else {
            throw new IllegalArgumentException("unknown data source: " + sourceName);
        }
    }
}
