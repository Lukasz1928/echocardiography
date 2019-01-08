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
public class TestParameter {

    @DataProvider
    public static Object[][] listArgumentsProvider() {
        return new Object[][]{
                {new ArrayList<Double>()},
                {Collections.singletonList(1.0)},
                {Arrays.asList(2.0, -1.5)},
                {Arrays.asList(0, 0.1, 2.1)},
                {Arrays.asList(0, 1.2, 5.4, -0.7)},
        };
    }

    @Test
    @UseDataProvider("listArgumentsProvider")
    public void testListSetter(List<Double> args) {
        Parameter p = new Parameter();
        try {
            p.setParameters(args);
        }
        catch(IncorrectSizeException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.getParameters(), args);
    }

    @DataProvider
    public static Object[][] toStringProvider() {
        return new Object[][]{
                {new ArrayList<Double>(), ""},
                {Collections.singletonList(1.5), "1.5"},
                {Collections.singletonList(1.0), "1"},
                {Arrays.asList(0.0, 1.2, 2.0, 3.456, 1023.0), "0/1.2/2/3.456/1023"},
                {null, ""}
        };
    }


    @Test
    @UseDataProvider("toStringProvider")
    public void testToString(List<Double> args, String expected) {
        Parameter p = new Parameter();
        try {
            p.setParameters(args);
        }
        catch(IncorrectSizeException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.toString(), expected);
    }
}
