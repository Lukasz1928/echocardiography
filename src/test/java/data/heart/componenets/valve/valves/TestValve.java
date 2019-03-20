package data.heart.componenets.valve.valves;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import data.heart.components.valve.regurgiation.RegurgiationLevel;
import data.heart.components.valve.type.ValveType;
import data.heart.components.valve.valves.Valve;
import data.heart.parameters.exceptions.ParameterException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class TestValve {

    private Valve v;

    @Before
    public void setup() {
        this.v = Mockito.mock(Valve.class, Mockito.withSettings().useConstructor().defaultAnswer(Mockito.CALLS_REAL_METHODS));
    }

    @DataProvider
    public static Object[][] numericDataWithSizeFrom1to2CorrectProvider() {
        return new Object[][] {
                {Collections.singletonList(1.2)},
                {Arrays.asList(1.2, 2.4)}
        };
    }

    @DataProvider
    public static Object[][] numericDataWithSizeFrom1to2IncorrectProvider() {
        return new Object[][] {
                {new ArrayList<Double>()},
                {Arrays.asList(1.2, 2.4, 3.6)}
        };
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2CorrectProvider")
    public void testGradientSizeCorrect(List<Double> data) {
        try {
            this.v.setGradient(data);
            Assert.assertEquals(this.v.getGradient().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testGradientSizeIncorrect(List<Double> data) {
        try {
            this.v.setGradient(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @DataProvider
    public static Object[][] valveTypeProvider() {
        return new Object[][]{
                {ValveType.NATIVE},
                {ValveType.ARTIFICIAL},
                {ValveType.BIOLOGICAL}
        };
    }

    @Test
    @UseDataProvider("valveTypeProvider")
    public void testValveType(ValveType type) {
        this.v.setType(type);
        Assert.assertEquals(this.v.getType(), type);
    }

    @DataProvider
    public static Object[][] regurgiationLevelProvider() {
        return new Object[][]{
                {RegurgiationLevel.NONE},
                {RegurgiationLevel.SMALL},
                {RegurgiationLevel.MODERATE},
                {RegurgiationLevel.BIG},
                {RegurgiationLevel.SEVERE}
        };
    }

    @Test
    @UseDataProvider("regurgiationLevelProvider")
    public void testRegurgiationLevel(RegurgiationLevel lvl) {
        this.v.setRegurgiationLevel(lvl);
        Assert.assertEquals(this.v.getRegurgiationLevel(), lvl);
    }
}
