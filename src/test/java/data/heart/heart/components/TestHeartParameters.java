package data.heart.heart.components;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import data.heart.components.HeartParameters;
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
public class TestHeartParameters {

    private HeartParameters hp;

    @Before
    public void setup() {
        this.hp = new HeartParameters();
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

    @DataProvider
    public static Object[][] numericDataWithSizeFrom1to3CorrectProvider() {
        return new Object[][] {
                {Collections.singletonList(1.2)},
                {Arrays.asList(1.2, 2.4)},
                {Arrays.asList(1.2, 2.4, 3.6)}
        };
    }

    @DataProvider
    public static Object[][] numericDataWithSizeFrom1to3IncorrectProvider() {
        return new Object[][] {
                {new ArrayList<Double>()},
                {Arrays.asList(1.2, 2.4, 3.6, 4.6)}
        };
    }

    @DataProvider
    public static Object[][] stringDataProvider() {
        return new Object[][] {
                {new ArrayList<String>()},
                {Collections.singletonList("aaa")},
                {Arrays.asList("aaa", "bbb")},
                {Arrays.asList("aaa", "bbb", "ccc")}
        };
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2CorrectProvider")
    public void testLeftVentricleSizeCorrect(List<Double> data) {
        try {
            this.hp.setLeftVentricle(data);
            Assert.assertEquals(this.hp.getLeftVentricle().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2CorrectProvider")
    public void testRightVentricleSizeCorrect(List<Double> data) {
        try {
            this.hp.setRightVerntricle(data);
            Assert.assertEquals(this.hp.getRightVerntricle().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to3CorrectProvider")
    public void testLeftAutriumSizeSizeCorrect(List<Double> data) {
        try {
            this.hp.setLeftAutriumSize(data);
            Assert.assertEquals(this.hp.getLeftAutriumSize().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testLeftAutriumAreaSizeCorrect(List<Double> data) {
        try {
            this.hp.setLeftAutriumArea(data);
            Assert.assertEquals(this.hp.getLeftAutriumArea().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2CorrectProvider")
    public void testRightAutriumSizeCorrect(List<Double> data) {
        try {
            this.hp.setRightAutrium(data);
            Assert.assertEquals(this.hp.getRightAutrium().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2CorrectProvider")
    public void testInterventricularSeptumSizeCorrect(List<Double> data) {
        try {
            this.hp.setInterventricularSeptum(data);
            Assert.assertEquals(this.hp.getInterventricularSeptum().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2CorrectProvider")
    public void testBackWallSizeCorrect(List<Double> data) {
        try {
            this.hp.setBackWall(data);
            Assert.assertEquals(this.hp.getBackWall().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testAscendingAortaSizeCorrect(List<Double> data) {
        try {
            this.hp.setAscendingAorta(data);
            Assert.assertEquals(this.hp.getAscendingAorta().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testBulbSizeCorrect(List<Double> data) {
        try {
            this.hp.setBulb(data);
            Assert.assertEquals(this.hp.getBulb().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testStjSizeCorrect(List<Double> data) {
        try {
            this.hp.setStj(data);
            Assert.assertEquals(this.hp.getStj().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testPulmonaryArterySizeCorrect(List<Double> data) {
        try {
            this.hp.setPulmonaryArtery(data);
            Assert.assertEquals(this.hp.getPulmonaryArtery().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testEfSizeCorrect(List<Double> data) {
        try {
            this.hp.setEf(data);
            Assert.assertEquals(this.hp.getEf().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1CorrectProvider")
    public void testEaSizeCorrect(List<Double> data) {
        try {
            this.hp.setEa(data);
            Assert.assertEquals(this.hp.getEa().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("stringDataProvider")
    public void testPericardium(List<String> data) {
        try {
            this.hp.setPericardium(data);
            Assert.assertEquals(this.hp.getPericardium().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("stringDataProvider")
    public void testContractility(List<String> data) {
        try {
            this.hp.setContractility(data);
            Assert.assertEquals(this.hp.getContractility().getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testLeftVentricleSizeIncorrect(List<Double> data) {
        try {
            this.hp.setLeftVentricle(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testRightVentricleSizeIncorrect(List<Double> data) {
        try {
            this.hp.setRightVerntricle(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to3IncorrectProvider")
    public void testLeftAutriumSizeSizeIncorrect(List<Double> data) {
        try {
            this.hp.setLeftAutriumSize(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testLeftAutriumAreaSizeIncorrect(List<Double> data) {
        try {
            this.hp.setLeftAutriumArea(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testRightAutriumSizeIncorrect(List<Double> data) {
        try {
            this.hp.setRightAutrium(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testInterventricularSeptumSizeIncorrect(List<Double> data) {
        try {
            this.hp.setInterventricularSeptum(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testBackWallSizeIncorrect(List<Double> data) {
        try {
            this.hp.setBackWall(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSizeFrom1to2IncorrectProvider")
    public void testAscendingAortaSizeIncorrect(List<Double> data) {
        try {
            this.hp.setAscendingAorta(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testBulbSizeIncorrect(List<Double> data) {
        try {
            this.hp.setBulb(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testStjSizeIncorrect(List<Double> data) {
        try {
            this.hp.setStj(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testPulmonaryArterySizeIncorrect(List<Double> data) {
        try {
            this.hp.setPulmonaryArtery(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testEfSizeIncorrect(List<Double> data) {
        try {
            this.hp.setEf(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }

    @Test
    @UseDataProvider("numericDataWithSize1IncorrectProvider")
    public void testEaSizeIncorrect(List<Double> data) {
        try {
            this.hp.setEa(data);
            Assert.fail();
        }
        catch(ParameterException e) {
            //it's supposed to be thrown
        }
    }
}
