import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    @Test
    public void multiplicationTest() {
        Calculator calc = new Calculator();

       assertEquals("multiply failed", 8, calc.multiply(2, 4));

    }


    @Test
    public void addTest() {
        Calculator calc = new Calculator();
        assertEquals("Add Field is",15, calc.add(7, 8));
    }
}