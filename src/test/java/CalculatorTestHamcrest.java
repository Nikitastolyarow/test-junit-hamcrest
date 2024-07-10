
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculatorTestHamcrest {

 Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertThat(calculator.add(2, 3), is(5));
    }
    @Test
    public void testSubtract() {
        assertThat(calculator.subtract(7, 3), is(4));
    }
    @Test
    public void testMultiply() {
        assertThat(calculator.multiply(2, 3), is(6));
    }
    @Test
    public void testDevide() {
        assertThat(calculator.devide(6, 3), is(2));
    }
    @Test
    public void testFactorial() {
        assertThat(calculator.factorial(1), is(1));
        assertThat(calculator.factorial(2), greaterThan(1));
    }
    @Test
    public  void testComparison(){
        double number = 20.5;
        double value = 20.7;
        MatcherAssert.assertThat(number, Matchers.lessThanOrEqualTo(value));
        
    }
}
