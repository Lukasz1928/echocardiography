package heart.parameters;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.apache.commons.lang3.ArrayUtils;
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
        p.setParameters(args);
        Assert.assertEquals(p.getParameters(), args);
    }

    @DataProvider
    public static Object[][] arrayArgumentsProvider() {
        return new Object[][]{
                {new double[]{}},
                {new double[]{1.0}},
                {new double[]{1.0, 2.0}},
                {new double[]{1.0, 2.0, 3.0}},
                {new double[]{1.0, 2.0, 3.0, 4.0}}
        };
    }

    @Test
    @UseDataProvider("arrayArgumentsProvider")
    public void testArraySetterWithNoArguments(double... args) {
        Parameter p = new Parameter();
        p.setParameters(args);
        Assert.assertEquals(args.length, p.getParameters().size());
        for(int i = 0; i < args.length; i++) {
            Assert.assertEquals(p.getParameters().get(i), args[i], 0.0);
        }
    }

    @Test
    public void testArraySetterManual0() {
        Parameter p = new Parameter();
        p.setParameters();
        Assert.assertEquals(p.getParameters(), new ArrayList<>());
    }

    @Test
    public void testArraySetterManual1() {
        Parameter p = new Parameter();
        p.setParameters(1);
        Assert.assertEquals(p.getParameters(), Collections.singletonList(1.0));
    }

    @Test
    public void testArraySetterManual2() {
        Parameter p = new Parameter();
        p.setParameters(1, 2);
        Assert.assertEquals(p.getParameters(), Arrays.asList(1.0, 2.0));
    }

    @Test
    public void testArraySetterManual3() {
        Parameter p = new Parameter();
        p.setParameters(1, 2, 3);
        Assert.assertEquals(p.getParameters(), Arrays.asList(1.0, 2.0, 3.0));
    }
}
