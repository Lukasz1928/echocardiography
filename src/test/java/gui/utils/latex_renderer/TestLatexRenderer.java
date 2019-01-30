package gui.utils.latex_renderer;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import gui.utils.LatexRenderer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.awt.image.BufferedImage;
import java.io.*;


@RunWith(DataProviderRunner.class)
public class TestLatexRenderer {

    private LatexRenderer lr;

    @Before
    public void setup() {
        this.lr = new LatexRenderer();
    }

//    @DataProvider
//    public static Object[][] simpleTextDataProvider() {
//        return new Object[][]{
//                {"{abcd}", "abcd"},
//                {"{a}", "a"},
//                {"", "empty"},
//                {"{AaBbCcDd}", "AaBbCcDd"},
//                {"{aaa bbb ccc}", "aaa_bbb_ccc"}
//            };
//
//    }
//
//    @Test
//    @UseDataProvider("simpleTextDataProvider")
//    public void testSimpleTextWithDefaultSize(String latex, String name) {
//        String expectedImagePath = String.format("gui/utils/latex_renderer/size/default/%s.png", name);
//        try {
//            BufferedImage img = ImageUtils.writableImage2BufferedImage(this.lr.latexToImage(latex));
//            BufferedImage expected = ImageUtils.readImage(expectedImagePath);
//            ImageUtils.assertImagesEqual(img, expected);
//        }
//        catch(IOException | IllegalArgumentException e) {
//            Assert.fail();
//        }
//    }
//
//    @DataProvider
//    public static Object[][] sizeDataProvider() {
//        return new Object[][] {
//                {"aaa", 10, "lower10"},
//                {"aaa", 15, "lower15"},
//                {"aaa", 20, "lower20"},
//                {"AAA", 10, "upper10"},
//                {"AAA", 15, "upper15"},
//                {"AAA", 20, "upper20"}
//        };
//    }
//
//    @Test
//    @UseDataProvider("sizeDataProvider")
//    public void testSimpleTextWithCustomSize(String latex, int size, String name) {
//        String expectedImagePath = String.format("gui/utils/latex_renderer/size/custom/%s.png", name);
//        try {
//            BufferedImage img = ImageUtils.writableImage2BufferedImage(this.lr.latexToImage(latex, size));
//            BufferedImage expected = ImageUtils.readImage(expectedImagePath);
//            ImageUtils.assertImagesEqual(img, expected);
//        }
//        catch(IOException| IllegalArgumentException e) {
//            Assert.fail();
//        }
//    }

    @DataProvider
    public static Object[][] subscriptTextDataProvider() {
        return new Object[][] {
                {"{AaA}_{bBb}", "AaA_bBb"}
        };
    }

    @Test
    @UseDataProvider("subscriptTextDataProvider")
    public void testSubstript(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/position/subscript/%s.png", name);
        try {
            BufferedImage img = ImageUtils.writableImage2BufferedImage(this.lr.latexToImage(latex));
            BufferedImage expected = ImageUtils.readImage(expectedImagePath);
            ImageUtils.assertImagesEqual(img, expected);
        }
        catch(IOException| IllegalArgumentException e) {
            Assert.fail();
        }
    }
}
