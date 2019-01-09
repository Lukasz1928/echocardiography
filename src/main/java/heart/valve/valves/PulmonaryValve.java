package heart.valve.valves;

import heart.parameters.FixedSizeParameter;
import heart.parameters.Parameter;
import lombok.Builder;

@Builder
public class PulmonaryValve extends Valve {
    private Parameter act;

    public PulmonaryValve() {
        super();
        this.act = new FixedSizeParameter(1, "ms");
    }
}
