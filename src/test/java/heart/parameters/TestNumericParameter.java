package heart.parameters;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import heart.parameters.exceptions.IncorrectSizeException;
import heart.parameters.exceptions.ParameterException;
import heart.parameters.exceptions.ParameterNotSetException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class TestNumericParameter {

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
        NumericParameter p = new NumericParameter();
        try {
            p.setParameters(args);
            Assert.assertEquals(p.getParameters(), args);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
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
        NumericParameter p = new NumericParameter();
        try {
            p.setParameters(args);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.toString(), expected);
    }

    @DataProvider
    public static Object[][] toStringWithUnitProvider() {
        return new Object[][]{
                {new ArrayList<Double>(), "mmHg", ""},
                {Collections.singletonList(1.5), "mm", "1.5mm"},
                {Collections.singletonList(1.0), "xyz", "1xyz"},
                {Arrays.asList(0.0, 1.2, 2.0, 3.456, 1023.0), "cm2", "0/1.2/2/3.456/1023cm2"},
                {null, ""}
        };
    }

    @Test
    @UseDataProvider("toStringWithUnitProvider")
    public void testToWithUnitString(List<Double> args, String unit, String expected) {
        NumericParameter p = new NumericParameter(unit);
        try {
            p.setParameters(args);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.toString(), expected);
    }



    @Test
    public void testGetWithoutSettingParameters() {
        NumericParameter p = new NumericParameter();
        try {
            p.getParameters();
            Assert.fail();
        }
        catch(ParameterNotSetException e) {
            //it's supposed to be thrown
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }
}
