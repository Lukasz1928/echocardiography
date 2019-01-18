package heart.parameters;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import heart.parameters.exceptions.IncorrectSizeException;
import heart.parameters.exceptions.ParameterException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class TestBoundedSizeNumericParameter {

    @DataProvider
    public static Object[][] correctSizeWithBothBoundsProvider() {
        return new Object[][]{
                {0, 2, new ArrayList<Double>()},
                {0, 100, Collections.singletonList(1.1)},
                {2, 2, Arrays.asList(1.0, 2.0)},
                {1, 3, Arrays.asList(1.0, 3.0, 2.0)},
                {1, 17, Arrays.asList(0.0, 2.0, 1.0, 17000000.5)}
        };
    }

    @Test
    @UseDataProvider("correctSizeWithBothBoundsProvider")
    public void testCorrectSizeConstraintWithBothBounds(int low, int high, List<Double> parameters) {
        NumericParameter p = new BoundedSizeNumericParameter(low, high);
        try {
            p.setParameters(parameters);
            Assert.assertEquals(p.getParameters(), parameters);
        }
        catch(ParameterException e) {
            Assert.fail();
        }

    }

    @DataProvider
    public static Object[][] incorrectSizeWithBothBoundsProvider() {
        return new Object[][]{
                {1, 2, new ArrayList<Double>()},
                {2, 2, Collections.singletonList(1.1)},
                {3, 1, Arrays.asList(1.0, 2.0)},
                {0, 2, Arrays.asList(1.0, 3.0, 2.0)},
                {0, 1, Arrays.asList(0.0, 2.0, 1.0, 17000000.5)}
        };
    }

    @Test
    @UseDataProvider("incorrectSizeWithBothBoundsProvider")
    public void testIncorrectSizeConstraintWithBothBounds(int low, int high, List<Double> parameters) {
        NumericParameter p = new BoundedSizeNumericParameter(low, high);
        try {
            p.setParameters(parameters);
            Assert.fail();
        }
        catch(IncorrectSizeException e) {
            //it's supposed to be thrown
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }
}
