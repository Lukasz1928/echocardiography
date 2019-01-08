package heart.valve.valves;

import heart.parameters.Parameter;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class PulmonaryValve extends Valve {
    private Parameter act; //1ms
}
