package gui.utils.latex_renderer;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import javafx.scene.image.WritableImage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.awt.image.BufferedImage;


@RunWith(DataProviderRunner.class)
public class TestLatexRenderer {

    private LatexRenderer lr;

    @Before
    public void setup() {
        this.lr = new LatexRenderer();
    }

    @DataProvider
    public static Object[][] simpleTextDataProvider() {
        return new Object[][]{
                {"{abcd}", "abcd"},
                {"{a}", "a"},
                {"{}", "empty"},
                {"{AaBbCcDd}", "AaBbCcDd"},
                {"{aaa bbb ccc}", "aaa_bbb_ccc"}
            };
    }

    @Test
    @UseDataProvider("simpleTextDataProvider")
    public void testSimpleTextWithDefaultSize(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/size/default/%s.png", name);
        this.assertCorrectImage(latex, expectedImagePath);
    }

    @DataProvider
    public static Object[][] bracketsDataProvider() {
            return new Object[][] {
                    {"abcd", "abcd"},
                    {"", "empty"},
                    {"aaa bbb ccc", "aaa_bbb_ccc"}
            };
    }

    @Test
    @UseDataProvider("simpleTextDataProvider")
    public void testBrackets(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/size/default/%s.png", name);
        this.assertCorrectImage(latex, expectedImagePath);
    }

    @DataProvider
    public static Object[][] sizeDataProvider() {
        return new Object[][] {
                {"{aaa}", 10, "lower10"},
                {"{aaa}", 15, "lower15"},
                {"{aaa}", 20, "lower20"},
                {"{AAA}", 10, "upper10"},
                {"{AAA}", 15, "upper15"},
                {"{AAA}", 20, "upper20"}
        };
    }

    @Test
    @UseDataProvider("sizeDataProvider")
    public void testSimpleTextWithCustomSize(String latex, int size, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/size/custom/%s.png", name);
        try {
            BufferedImage img = ImageUtils.writableImage2BufferedImage(this.lr.latexToImage(latex, size));
            BufferedImage expected = ImageUtils.readImage(expectedImagePath);
            ImageUtils.assertImagesEqual(img, expected);
        }
        catch(Exception e) {
            Assert.fail();
        }
    }

    @DataProvider
    public static Object[][] subscriptTextDataProvider() {
        return new Object[][]{
                {"{aaa}_{bbb}", "aaa_bbb"},
                {"{aaa}_{bbb}_{ccc}", "aaa_bbb_ccc"}
        };
    }

    @Test
    @UseDataProvider("subscriptTextDataProvider")
    public void testSubscript(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/position/subscript/%s.png", name);
        this.assertCorrectImage(latex, expectedImagePath);
    }

    @DataProvider
    public static Object[][] superscriptTextDataProvider() {
        return new Object[][]{
                {"{aaa}^{bbb}", "aaa^bbb"},
                {"{aaa}^{bbb}^{ccc}", "aaa^bbb^ccc"}
        };
    }

    @Test
    @UseDataProvider("superscriptTextDataProvider")
    public void testSuperscript(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/position/superscript/%s.png", name);
        this.assertCorrectImage(latex, expectedImagePath);
    }

    @DataProvider
    public static Object[][] superscriptAndSubscriptTextDataProvider() {
        return new Object[][]{
                {"{aaa}^{bbb}_{ccc}", "aaa^bbb_ccc"},
                {"{aaa}_{bbb}^{ccc}", "aaa_bbb^ccc"},
                {"{aaa}_{bbb}_{ccc}^{ddd}_{eee}", "aaa_bbb_ccc^ddd_eee"},
                {"{aaa}^{bbb}_{ccc}_{ddd}^{eee}", "aaa^bbb_ccc_ddd^eee"}
        };
    }

    @Test
    @UseDataProvider("superscriptAndSubscriptTextDataProvider")
    public void testSuperscriptAndSubscript(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/position/superscript_and_subscript/%s.png", name);
        this.assertCorrectImage(latex, expectedImagePath);
    }

    @DataProvider
    public static Object[][] multipleGroupsDataProvider() {
        return new Object[][]{
                {"{aa}^{bb}_{cc}{pp}^{qq}^{rr}", "two1"},
                {"{aa}_{bb}^{cc}{pp}^{qq}_{rr}", "two2"},
                {"{aa}^{bb}^{cc}{pp}_{qq}", "two3"},
                {"{aa}^{bb}{pp}_{qq}_{rr}", "two4"},
                {"{a}^{b}_{c}{p}_{q}^{r}{x}_{y}^{z}", "three"}
        };
    }

    @Test
    @UseDataProvider("multipleGroupsDataProvider")
    public void testMultipleGroups(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/grouping/%s.png", name);
        this.assertCorrectImage(latex, expectedImagePath);
    }

    @DataProvider
    public static Object[][] diactriticalMarksDataProvider() {
        return new Object[][] {
                {"{ąćęśłóżź}^{ąćęśłóżź}_{ąćęśłóżź}", "pl_low"},
                {"{ĄĆĘŁÓŚŹŻ}^{ĄĆĘŁÓŚŹŻ}_{ĄĆĘŁÓŚŹŻ}", "pl_up"},
                {"{äöüß}^{äöüß}_{äöüß}", "ger"}
        };
    }

    @Test
    @UseDataProvider("diactriticalMarksDataProvider")
    public void testDiactriticalMarks(String latex, String name) {
        String expectedImagePath = String.format("gui/utils/latex_renderer/diacritics/%s.png", name);
        this.assertCorrectImage(latex, expectedImagePath);
    }

    @DataProvider
    public static Object[][] wrongFormatDataProvider() {
        return new Object[][] {
                {"^{aaa}"},
                {"_{bbb}"},
                {"^{aaa}_{aaa}"},
                {"{aaa"},
                {"xy}"},
                {"aaa^{xyz}"},
                {"^"},
                {"_"}
        };
    }

    @Test
    @UseDataProvider("wrongFormatDataProvider")
    public void testWrongFormat(String latex) {
        try {
            WritableImage img = this.lr.latexToImage(latex);
            Assert.fail();
        }
        catch(FormatException e) {
            //it's supposed to be thrown
        }
    }

    private void assertCorrectImage(String latex, String expectedImagePath) {
        try {
            BufferedImage img = ImageUtils.writableImage2BufferedImage(this.lr.latexToImage(latex));
            BufferedImage expected = ImageUtils.readImage(expectedImagePath);
            ImageUtils.assertImagesEqual(img, expected);
        }
        catch(Exception e) {
            Assert.fail();
        }
    }
}
