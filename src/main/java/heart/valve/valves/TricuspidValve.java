package heart.valve.valves;

import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class TricuspidValve extends Valve {
    private Object rvsp; //1mmHg
    private Object ivc; //2mm
    private Object tapse; //1mm
    private Object vc; //1mm
}
