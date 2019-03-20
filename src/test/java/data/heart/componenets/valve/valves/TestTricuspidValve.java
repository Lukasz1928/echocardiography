package data.heart.componenets.valve.valves;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import data.heart.components.valve.leaflets.LeafletsType;
import data.heart.components.valve.leaflets.leaflets.AorticValveLeaflets;
import data.heart.components.valve.leaflets.leaflets.MitralValveLeaflets;
import data.heart.components.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import data.heart.components.valve.leaflets.leaflets.TricuspidValveLeaflets;
import data.heart.components.valve.valves.TricuspidValve;
import data.heart.parameters.exceptions.ParameterException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class TestTricuspidValve {

    private TricuspidValve v;

    @Before
    public void setup() {
        this.v = new TricuspidValve();
    }

    @DataProvider
    public static Object[][] numericDataWithSize1CorrectProvider() {
        return new Object[][] {
                {Collections.singletonList(1.2)}
        };
    }

    @DataProvider
    public static Object[][] numericDataWithSize1IncorrectProvider() {
        return new Object[][] {
                {new ArrayList<Double>()},
                {Arrays.asList(1.2, 10.0)}
        };
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
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testRvspSizeCorrect(List<Double> data) {
        try {
            this.v.setRvsp(data);
            Assert.assertEquals(this.v.getRvsp().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testRvspSizeIncorrect(List<Double> data) {
        try {
            this.v.setRvsp(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2CorrectProvider")
    public void testIvcSizeCorrect(List<Double> data) {
        try {
            this.v.setIvc(data);
            Assert.assertEquals(this.v.getIvc().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testIvcSizeIncorrect(List<Double> data) {
        try {
            this.v.setIvc(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testTapseSizeCorrect(List<Double> data) {
        try {
            this.v.setTapse(data);
            Assert.assertEquals(this.v.getTapse().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testTapseSizeIncorrect(List<Double> data) {
        try {
            this.v.setTapse(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testVcSizeCorrect(List<Double> data) {
        try {
            this.v.setVc(data);
            Assert.assertEquals(this.v.getVc().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testVcSizeIncorrect(List<Double> data) {
        try {
            this.v.setVc(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @DataProvider
    public static Object[][] leafletsTypeCorrectProvider() {
        Object[][] a = new Object[TricuspidValveLeaflets.values().length][1];
        for(int i = 0; i < TricuspidValveLeaflets.values().length; i++) {
            a[i][0] = TricuspidValveLeaflets.values()[i];
        }
        return a;
    }

    @Test
    @UseDataProvider("leafletsTypeCorrectProvider")
    public void testLeafletsTypeCorrect(LeafletsType type) {
        try {
            this.v.setLeafletsType(type);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @DataProvider
    public static Object[][] leafletsTypeIncorrectProvider() {
        return new Object[][] {
                {PulmonaryValveLeaflets.CALCIFIED},
                {AorticValveLeaflets.RIGHT},
                {MitralValveLeaflets.FIBROTIC_WITH_CALCIFICATIONS}
        };
    }

    @Test
    @UseDataProvider("leafletsTypeIncorrectProvider")
    public void testLeafletsTypeIncorrect(LeafletsType type) {
        try {
            this.v.setLeafletsType(type);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }
}
