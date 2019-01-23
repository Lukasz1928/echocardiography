package heart.componenets.valve.valves;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import heart.components.valve.leaflets.LeafletsType;
import heart.components.valve.leaflets.leaflets.AorticValveLeaflets;
import heart.components.valve.leaflets.leaflets.MitralValveLeaflets;
import heart.components.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import heart.components.valve.leaflets.leaflets.TricuspidValveLeaflets;
import heart.components.valve.valves.MitralValve;
import heart.parameters.exceptions.ParameterException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class TestMitralValve {

    private MitralValve v;

    @Before
    public void setup() {
        this.v = new MitralValve();
    }

    @DataProvider
    public static Object[][] numericDataWithSize1CorrectProvider() {
        return new Object[][]{
                {Collections.singletonList(1.2)}
        };
    }

    @DataProvider
    public static Object[][] numericDataWithSize1IncorrectProvider() {
        return new Object[][]{
                {new ArrayList<Double>()},
                {Arrays.asList(1.2, 10.0)}
        };
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testMapseSizeCorrect(List<Double> data) {
        try {
            this.v.setMapse(data);
            Assert.assertEquals(this.v.getMapse().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testMapseSizeIncorrect(List<Double> data) {
        try {
            this.v.setMapse(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testMvaSizeCorrect(List<Double> data) {
        try {
            this.v.setMva(data);
            Assert.assertEquals(this.v.getMva().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testMvaSizeIncorrect(List<Double> data) {
        try {
            this.v.setMva(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testVcSizeCorrect(List<Double> data) {
        try {
            this.v.setVc(data);
            Assert.assertEquals(this.v.getVc().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testVcSizeIncorrect(List<Double> data) {
        try {
            this.v.setVc(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testRpisaSizeCorrect(List<Double> data) {
        try {
            this.v.setRpisa(data);
            Assert.assertEquals(this.v.getRpisa().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testRpisaSizeIncorrect(List<Double> data) {
        try {
            this.v.setRpisa(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testEroSizeCorrect(List<Double> data) {
        try {
            this.v.setEro(data);
            Assert.assertEquals(this.v.getEro().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testEroSizeIncorrect(List<Double> data) {
        try {
            this.v.setEro(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testDviSizeCorrect(List<Double> data) {
        try {
            this.v.setDvi(data);
            Assert.assertEquals(this.v.getDvi().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testDviSizeIncorrect(List<Double> data) {
        try {
            this.v.setDvi(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testVtiPrSizeCorrect(List<Double> data) {
        try {
            this.v.setVtiPr(data);
            Assert.assertEquals(this.v.getVtiPr().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testVtiPrSizeIncorrect(List<Double> data) {
        try {
            this.v.setVtiPr(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testVtiLvotSizeCorrect(List<Double> data) {
        try {
            this.v.setVtiLvot(data);
            Assert.assertEquals(this.v.getVtiLvot().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testVtiLvotSizeIncorrect(List<Double> data) {
        try {
            this.v.setVtiLvot(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testEoaSizeCorrect(List<Double> data) {
        try {
            this.v.setEoa(data);
            Assert.assertEquals(this.v.getEoa().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testEoaSizeIncorrect(List<Double> data) {
        try {
            this.v.setEoa(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testCsaLvotSizeCorrect(List<Double> data) {
        try {
            this.v.setCsaLvot(data);
            Assert.assertEquals(this.v.getCsaLvot().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testCsaLvotSizeIncorrect(List<Double> data) {
        try {
            this.v.setCsaLvot(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testPhtSizeCorrect(List<Double> data) {
        try {
            this.v.setPht(data);
            Assert.assertEquals(this.v.getPht().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testPhtSizeIncorrect(List<Double> data) {
        try {
            this.v.setPht(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testVmaxSizeCorrect(List<Double> data) {
        try {
            this.v.setVmax(data);
            Assert.assertEquals(this.v.getVmax().getParameters(), data);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testVmaxSizeIncorrect(List<Double> data) {
        try {
            this.v.setVmax(data);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }


    @DataProvider
    public static Object[][] leafletsTypeCorrectProvider() {
        Object[][] a = new Object[MitralValveLeaflets.values().length][1];
        for(int i = 0; i < MitralValveLeaflets.values().length; i++) {
            a[i][0] = MitralValveLeaflets.values()[i];
        }
        return a;
    }

    @Test
    @UseDataProvider("leafletsTypeCorrectProvider")
    public void testLeafletsTypeCorrect(LeafletsType type) {
        try {
            this.v.setLeafletsType(type);
        } catch(ParameterException e) {
            Assert.fail();
        }
    }

    @DataProvider
    public static Object[][] leafletsTypeIncorrectProvider() {
        return new Object[][]{
                {PulmonaryValveLeaflets.CALCIFIED},
                {TricuspidValveLeaflets.RIGHT},
                {AorticValveLeaflets.BICUSPID}
        };
    }

    @Test
    @UseDataProvider("leafletsTypeIncorrectProvider")
    public void testLeafletsTypeIncorrect(LeafletsType type) {
        try {
            this.v.setLeafletsType(type);
            Assert.fail();
        } catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }
}
