package sample;

import org.junit.*;

public class TestDummy {

    @Test
    public void dummyTest() {
        Assert.assertEquals(0, 0.00000001, 0.0001);
    }
}
