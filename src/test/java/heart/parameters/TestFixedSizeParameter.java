package heart.parameters;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class TestFixedSizeParameter {

    @DataProvider
    public static Object[][] correctSizeProvider() {
            return new Object[][]{
                    {0, new ArrayList<Double>()},
                    {1, Collections.singletonList(1.1)},
                    {2, Arrays.asList(1.0, 2.0)},
                    {3, Arrays.asList(1.0, 3.0, 2.0)},
                    {4, Arrays.asList(0.0, 2.0, 1.0, 17000000.5)}
            };
    }

    @Test
    @UseDataProvider("correctSizeProvider")
    public void testSizeConstraintCorrect(int size, List<Double> parameters) {
        Parameter p = new FixedSizeParameter(size);
        try {
            p.setParameters(parameters);
        }
        catch(IncorrectSizeException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.getParameters(), parameters);
    }

    @DataProvider
    public static Object[][] incorrectSizeProvider() {
        return new Object[][]{
                {0, Collections.singletonList(0.01)},
                {1, Arrays.asList(1.0, 2.0)},
                {2, Collections.singletonList(1.0)},
                {3, Arrays.asList(1.0, 3.0, 2.0, 4.0)},
                {10000, Arrays.asList(0.0, 2.0, 1.0, 17000000.5)}
        };
    }

    @Test
    @UseDataProvider("incorrectSizeProvider")
    public void testSizeConstraintIncorrect(int size, List<Double> parameters) {
        Parameter p = new FixedSizeParameter(size);
        try {
            p.setParameters(parameters);
            Assert.fail();
        }
        catch(IncorrectSizeException e) {
            //it's supposed to be thrown
        }
    }
}
