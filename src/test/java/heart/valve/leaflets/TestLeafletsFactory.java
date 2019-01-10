package heart.valve.leaflets;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import heart.valve.leaflets.factory.LeafletsFactory;
import heart.valve.leaflets.factory.NoSuchLeafletsTypeException;
import heart.valve.leaflets.factory.NoSuchValveException;
import heart.valve.leaflets.leaflets.AorticValveLeaflets;
import heart.valve.leaflets.leaflets.MitralValveLeaflets;
import heart.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import heart.valve.leaflets.leaflets.TricuspidValveLeaflets;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class TestLeafletsFactory {

    @DataProvider
    public static Object[][] leafletsCorrectProvider() {
        return new Object[][]{
                {"mitral", "right", MitralValveLeaflets.RIGHT},                   {"mitral", "RIGHT", MitralValveLeaflets.RIGHT},
                {"mitral", "fibrotic", MitralValveLeaflets.FIBROTIC},             {"mitral", "FIBROTIC", MitralValveLeaflets.FIBROTIC},
                {"mitral", "calcified", MitralValveLeaflets.CALCIFIED},           {"mitral", "CALCIFIED", MitralValveLeaflets.CALCIFIED},
                {"mitral", "front_prolaps", MitralValveLeaflets.FRONT_PROLAPS},   {"mitral", "FRONT_PROLAPS", MitralValveLeaflets.FRONT_PROLAPS},
                {"mitral", "back_prolaps", MitralValveLeaflets.BACK_PROLAPS},     {"mitral", "BACK_PROLAPS", MitralValveLeaflets.BACK_PROLAPS},
                {"mitral", "both_prolaps", MitralValveLeaflets.BOTH_PROLAPS},     {"mitral", "BOTH_PROLAPS", MitralValveLeaflets.BOTH_PROLAPS},
                {"mitral", "calcified_ring", MitralValveLeaflets.CALCIFIED_RING}, {"mitral", "CALCIFIED_RING", MitralValveLeaflets.CALCIFIED_RING},

                {"aortic", "right", AorticValveLeaflets.RIGHT},                   {"aortic", "RIGHT", AorticValveLeaflets.RIGHT},
                {"aortic", "fibrotic", AorticValveLeaflets.FIBROTIC},             {"aortic", "FIBROTIC", AorticValveLeaflets.FIBROTIC},
                {"aortic", "calcified", AorticValveLeaflets.CALCIFIED},           {"aortic", "CALCIFIED", AorticValveLeaflets.CALCIFIED},
                {"aortic", "bicuspid", AorticValveLeaflets.BICUSPID},             {"aortic", "BICUSPID", AorticValveLeaflets.BICUSPID},

                {"tricuspid", "right", TricuspidValveLeaflets.RIGHT}, {"tricuspid", "RIGHT", TricuspidValveLeaflets.RIGHT},
                {"tricuspid", "fibrotic", TricuspidValveLeaflets.FIBROTIC}, {"tricuspid", "FIBROTIC", TricuspidValveLeaflets.FIBROTIC},
                {"tricuspid", "calcified", TricuspidValveLeaflets.CALCIFIED}, {"tricuspid", "CALCIFIED", TricuspidValveLeaflets.CALCIFIED},

                {"pulmonary", "right", PulmonaryValveLeaflets.RIGHT}, {"pulmonary", "RIGHT", PulmonaryValveLeaflets.RIGHT},
                {"pulmonary", "thickened", PulmonaryValveLeaflets.THICKENED}, {"pulmonary", "THICKENED", PulmonaryValveLeaflets.THICKENED}
        };
    }

    @Test
    @UseDataProvider("leafletsCorrectProvider")
    public void testCorrectObjectProduced(String valve, String leaflets, Object expected) {
        try {
            Object l = LeafletsFactory.getLeaflets(valve, leaflets);
            Assert.assertEquals(l, expected);
        }
        catch(NoSuchValveException | NoSuchLeafletsTypeException e) {
            Assert.fail();
        }
    }

    @DataProvider
    public static Object[][] leafletsNonexistentProvider() {
        return new Object[][]{
                {"mitral", ""},               {"aortic", ""},               {"tricuspid", ""},               {"pulmonary", ""},
                {"mitral", "aaa"},            {"aortic", "aaa"},            {"tricuspid", "aaa"},            {"pulmonary", "aaa"},
                {"mitral", "_calcified"},     {"aortic", "_calcified"},     {"tricuspid", "_calcified"},     {"pulmonary", "_calcified"},
                {"mitral", "prolaps"},        {"aortic", "prolaps"},        {"tricuspid", "prolaps"},        {"pulmonary", "prolaps"},
                {"mitral", "back_prolap"},    {"aortic", "back_prolap"},    {"tricuspid", "back_prolap"},    {"pulmonary", "back_prolap"},
                {"mitral", "both-prolaps"},   {"aortic", "both-prolaps"},   {"tricuspid", "both-prolaps"},   {"pulmonary", "both-prolaps"},
                {"mitral", "ring_calcified"}, {"aortic", "ring_calcified"}, {"tricuspid", "ring_calcified"}, {"pulmonary", "ring_calcified"},
                {"mitral", null},             {"aortic", null},             {"tricuspid", null},             {"pulmonary", null}
        };
    }

    @Test
    @UseDataProvider("leafletsNonexistentProvider")
    public void testNonexistentLeafletsType(String valve, String leaflets) {
        try {
            Object l = LeafletsFactory.getLeaflets(valve, leaflets);
            Assert.fail();
        }
        catch(NoSuchLeafletsTypeException e) {
            // it is supposed to be thrown
        }
        catch(Exception e) {
            Assert.fail();
        }
    }

    @DataProvider
    public static Object[][] nonexistentValveProvider() {
        return new Object[][]{
                {"aaa", "right"},
                {null, "right"},
                {"", "right"},
                {"", ""},
                {null, null}
        };
    }

    @Test
    @UseDataProvider("nonexistentValveProvider")
    public void testNonexistentValve(String valve, String leaflets) {
        try {
            Object l = LeafletsFactory.getLeaflets(valve, leaflets);
            Assert.fail();
        }
        catch(NoSuchValveException e) {
            // it is supposed to be thrown
        }
        catch(Exception e) {
            Assert.fail();
        }
    }
}
