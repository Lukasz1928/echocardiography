package heart.valve.valves;

import heart.parameters.Parameter;
import heart.valve.type.ValveType;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class AorticValve extends Valve {

    private Parameter vc; //1mm
    private Parameter ialvot; //1%
    private Parameter pht; //1ms
    private Parameter rpisa; //1mm
    private Parameter ava; //1cm^2
    private Parameter vmax; //1m/s
    private Parameter dvi; //vmax_lvot, vmax_pr  //1-, 1m/s, 1m/s
    private Parameter eoa; //csa_lvot, vti_lvot, vti_pr //1cm^2, 1mm, 1-, 1-
    private Parameter at; //1ms

}
