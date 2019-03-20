package data.heart.parameters;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import data.heart.parameters.exceptions.ParameterException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class TestDescriptiveParameter {

    @DataProvider
    public static Object[][] toStringProvider() {
        return new Object[][]{
                {new ArrayList<String>(), ""},
                {Collections.singletonList("Hello"), "Hello"},
                {Collections.singletonList(""), ""},
                {Arrays.asList("Abc", "def", "ghi"), "Abc\ndef\nghi"},
                {Arrays.asList("AAA.", "xy, abcde", ""), "AAA.\nxy, abcde"},
                {Arrays.asList("", "", "", ""), ""},
                {Arrays.asList("abc", "", "def ", "", " ", "aaa"), "abc\ndef \n \naaa"}
        };
    }

    @Test
    @UseDataProvider("toStringProvider")
    public void testToString(List<String> data, String expected) {
        Parameter<String> p = new DescriptiveParameter();
        try {
            p.setParameters(data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.toString(), expected);
    }

    @DataProvider
    public static Object[][] listProvider() {
        return new Object[][]{
                {new ArrayList<String>()},
                {Collections.singletonList("Hello")},
                {Collections.singletonList("")},
                {Arrays.asList("Abc", "def", "ghi")}
        };
    }

    @Test
    @UseDataProvider("listProvider")
    public void testListSetter(List<String> data) {
        Parameter<String> p = new DescriptiveParameter();
        try {
            p.setParameters(data);
            Assert.assertEquals(p.getParameters(), data);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
    }
}
