package heart.valve.valves;

import heart.parameters.BoundedSizeParameter;
import heart.parameters.FixedSizeParameter;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.TricuspidValveLeaflets;
import lombok.Builder;

@Builder
public class TricuspidValve extends Valve {
    private Parameter rvsp;
    private Parameter ivc;
    private Parameter tapse;
    private Parameter vc;

    public TricuspidValve() {
        super();

        this.leafletsType = TricuspidValveLeaflets.RIGHT;

        this.rvsp = new FixedSizeParameter(1, "mmHg");
        this.ivc = new BoundedSizeParameter(1, 2, "mm");
        this.tapse = new FixedSizeParameter(1, "mm");
        this.vc = new FixedSizeParameter(1, "mm");
    }
}
