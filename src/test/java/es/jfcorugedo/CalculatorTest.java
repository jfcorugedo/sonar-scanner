package es.jfcorugedo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * Unit test for simple Calculator.
 */
public class CalculatorTest
{

    @Test
    public void testSum() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.sum(1, 5);

        //then
        assertThat(result, is(6));
    }

    @Test
    public void testMod() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.mod(15, 3);

        //then
        assertThat(result, is(0));
    }
}
