package es.jfcorugedo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Unit test for simple Calculator.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculator.class)
public class CalculatorConstructorTest
{

    @Test
    public void testComputeMagicNumber() throws Exception{

        //given
        whenNew(MathUtility.class).withNoArguments().thenReturn(new MathUtilityMock());
        Calculator calculator = new Calculator();

        //when
        int result = calculator.computeMagicNumber();

        //then
        assertThat(result, is(10));
    }
}
