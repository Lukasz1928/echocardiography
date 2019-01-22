package heart;

import heart.components.valve.valves.AorticValve;
import heart.components.valve.valves.MitralValve;
import heart.components.valve.valves.PulmonaryValve;
import heart.components.valve.valves.TricuspidValve;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestHeart {
    @Test
    public void testReturnTypeMitral() {
        Heart h = new Heart();
        Assert.assertThat(h.getMitralValve(), instanceOf(MitralValve.class));
    }

    @Test
    public void testReturnTypeAortic() {
        Heart h = new Heart();
        Assert.assertThat(h.getAorticValve(), instanceOf(AorticValve.class));
    }

    @Test
    public void testReturnTypePulmonary() {
        Heart h = new Heart();
        Assert.assertThat(h.getPulmonaryValve(), instanceOf(PulmonaryValve.class));
    }

    @Test
    public void testReturnTypeTricuspid() {
        Heart h = new Heart();
        Assert.assertThat(h.getTricuspidValve(), instanceOf(TricuspidValve.class));
    }
}
