package es.jfcorugedo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

/**
 * Unit test for simple Calculator.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(MathUtility.class)
public class CalculatorStaticMethodTest
{

    @Test
    public void testRandom() {

        //given
        mockStatic(MathUtility.class);
        when(MathUtility.random()).thenReturn(10.5);
        Calculator calculator = new Calculator();

        //when
        int result = calculator.random();

        //then
        assertThat(result, is(1050));
    }
}
