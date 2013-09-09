package exercise.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "test/exercise/cucumber",
                  format = {"pretty", "html:reports/cucumber/html", "junit:reports/cucumber/junit"})
public class CucumberDataFittingTest {
}
