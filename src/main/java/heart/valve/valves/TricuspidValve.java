package heart.valve.valves;

import heart.parameters.Parameter;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class TricuspidValve extends Valve {
    private Parameter rvsp; //1mmHg
    private Parameter ivc; //2mm
    private Parameter tapse; //1mm
    private Parameter vc; //1mm
}
