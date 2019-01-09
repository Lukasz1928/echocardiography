package heart.valve.valves;

import heart.parameters.FixedSizeParameter;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import lombok.Builder;

@Builder
public class PulmonaryValve extends Valve {
    private Parameter act;

    public PulmonaryValve() {
        super();
        this.leafletsType = PulmonaryValveLeaflets.RIGHT;

        this.act = new FixedSizeParameter(1, "ms");
    }
}
