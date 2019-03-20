package data.heart.parameters;

import data.heart.parameters.exceptions.ParameterException;
import data.heart.parameters.exceptions.ParameterNotSetException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Collections;
import java.util.List;

public class TestParameter {

    @Test
    public void testIsSetNegative() {
        Parameter p = Mockito.mock(Parameter.class, Mockito.CALLS_REAL_METHODS);
        Assert.assertFalse(p.isSet());
    }

    @Test
    public void testIsSetPositive() {
        Parameter p = Mockito.mock(Parameter.class, Mockito.CALLS_REAL_METHODS);
        try {
            p.setParameters(Collections.singletonList("aaa"));
        }
        catch(ParameterException e) {
            Assert.fail();
        }
        Assert.assertTrue(p.isSet());
    }

    @Test
    public void testGetNotSetParameters() {
        Parameter p = Mockito.mock(Parameter.class, Mockito.CALLS_REAL_METHODS);
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

    @Test
    public void testSetParameters() {
        Parameter p = Mockito.mock(Parameter.class, Mockito.CALLS_REAL_METHODS);
        List<String> toSet = Collections.singletonList("aaa");
        try {
            p.setParameters(toSet);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
        Assert.assertEquals(p.parameters, toSet);
    }

    @Test
    public void testGetParameters() {
        Parameter p = Mockito.mock(Parameter.class, Mockito.CALLS_REAL_METHODS);
        List<String> toSet = Collections.singletonList("aaa");
        try {
            p.setParameters(toSet);
        }
        catch(ParameterException e) {
            Assert.fail();
        }
        try {
            Assert.assertEquals(p.getParameters(), toSet);
        }
        catch(Exception e) {
            Assert.fail();
        }
    }
}
