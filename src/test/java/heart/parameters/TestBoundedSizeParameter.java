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
public class TestBoundedSizeParameter {

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
        Parameter p = new BoundedSizeParameter(low, high);
        try {
            p.setParameters(parameters);
        }
        catch(IncorrectSizeException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.getParameters(), parameters);
    }

    @DataProvider
    public static Object[][] correctSizeWithOneBoundProvider() {
        return new Object[][]{
                {0,  new ArrayList<Double>()},
                {0,  Collections.singletonList(1.1)},
                {1,  Arrays.asList(1.0, 2.0)},
                {3,  Arrays.asList(1.0, 3.0, 2.0)},
                {-1, Arrays.asList(0.0, 2.0, 1.0, 17000000.5)}
        };
    }

    @Test
    @UseDataProvider("correctSizeWithOneBoundProvider")
    public void testCorrectSizeConstraintWithOneBound(int bound, List<Double> parameters) {
        Parameter p = new BoundedSizeParameter(bound);
        try {
            p.setParameters(parameters);
        }
        catch(IncorrectSizeException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.getParameters(), parameters);
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
        Parameter p = new BoundedSizeParameter(low, high);
        try {
            p.setParameters(parameters);
            Assert.fail();
        }
        catch(IncorrectSizeException e) {
            //it's supposed to be thrown
        }
    }

    @DataProvider
    public static Object[][] incorrectSizeWithOneBoundProvider() {
        return new Object[][]{
                {1,  new ArrayList<Double>()},
                {2,  Collections.singletonList(1.1)},
                {3,  Arrays.asList(1.0, 2.0)},
                {4,  Arrays.asList(1.0, 3.0, 2.0)},
                {7, Arrays.asList(0.0, 2.0, 1.0, 17000000.5)}
        };
    }

    @Test
    @UseDataProvider("incorrectSizeWithOneBoundProvider")
    public void testIncorrectSizeConstraintWithOneBound(int bound, List<Double> parameters) {
        Parameter p = new BoundedSizeParameter(bound);
        try {
            p.setParameters(parameters);
            Assert.fail();
        }
        catch(IncorrectSizeException e) {
            //it's supposed to be thrown
        }
    }
}
