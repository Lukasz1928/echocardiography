package heart.componenets.valve.valves;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import heart.components.valve.leaflets.LeafletsType;
import heart.components.valve.leaflets.leaflets.AorticValveLeaflets;
import heart.components.valve.leaflets.leaflets.MitralValveLeaflets;
import heart.components.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import heart.components.valve.leaflets.leaflets.TricuspidValveLeaflets;
import heart.components.valve.valves.PulmonaryValve;
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
public class TestPulmonaryValve {

    private PulmonaryValve v;

    @Before
    public void setup() {
        this.v = new PulmonaryValve();
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

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testActSizeCorrect(List<Double> data) {
        try {
            this.v.setAct(data);
            Assert.assertEquals(this.v.getAct().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testActSizeIncorrect(List<Double> data) {
        try {
            this.v.setAct(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @DataProvider
    public static Object[][] leafletsTypeCorrectProvider() {
        Object[][] a = new Object[PulmonaryValveLeaflets.values().length][1];
        for(int i = 0; i < PulmonaryValveLeaflets.values().length; i++) {
            a[i][0] = PulmonaryValveLeaflets.values()[i];
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
                {TricuspidValveLeaflets.CALCIFIED},
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
