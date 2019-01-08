package heart.valve.valves;

import heart.parameters.Parameter;
import heart.valve.gradient.Gradient;
import heart.valve.leaflets.LeafletsType;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class MitralValve extends Valve {
    private Parameter mapse; //1, mm
    private Parameter mva; //1, cm^2
    private Parameter vc; //1, mm
    private Parameter rpisa; //1, mm
    private Parameter ero; //1, cm^2
    private Parameter dvi; // vti_pr, vti_lvot //1- 1- 1-
    private Parameter eoa; // vti_pr, vti_lvot, csa_lvot // 1cm^2 1- 1- 1mm
    private Parameter pht; //1ms
    private Parameter vmax; //1m/s
}
