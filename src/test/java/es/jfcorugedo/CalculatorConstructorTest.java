package es.jfcorugedo;

import org.junit.Rule;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.agent.PowerMockAgent;
import org.powermock.modules.junit4.rule.PowerMockRule;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Unit test for simple Calculator.
 */
@PrepareForTest(Calculator.class)
public class CalculatorConstructorTest
{

    static {
        PowerMockAgent.initializeIfNeeded();
    }

    @Rule
    public PowerMockRule rule = new PowerMockRule();


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
