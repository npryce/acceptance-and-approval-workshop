package exercise.test;

import exercise.Polynomial;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PolynomialTest {
    @Test
    public void testToString() {
        assertThat(new Polynomial(1).toString(), equalTo("1.0"));
        assertThat(new Polynomial(1,2).toString(), equalTo("1.0 + 2.0*x"));
        assertThat(new Polynomial(3,5,2).toString(), equalTo("3.0 + 5.0*x + 2.0*x**2"));
        assertThat(new Polynomial(-7,-12,4,-6).toString(), equalTo("-7.0 - 12.0*x + 4.0*x**2 - 6.0*x**3"));
        assertThat(new Polynomial(4,0,2).toString(), equalTo("4.0 + 2.0*x**2"));
    }
}
