package exercise.cucumber;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import exercise.Algorithms;
import exercise.Point;
import exercise.Polynomial;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DataFittingSteps {
    List<Point> points = Lists.newArrayList();

    @Given("data points")
    public void addDataPoint(List<Point> ps) {
        points.addAll(ps);
    }

    @Then("best fit is (.+)")
    public void fitPoints(String curve) {
        assertThat(Algorithms.aardvark(points).toString(), equalTo(curve));
    }
}
