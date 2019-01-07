package heart.valve.valves;

import heart.valve.type.ValveType;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class AorticValve extends Valve {

    private Object vc; //1mm
    private Object ialvot; //1%
    private Object pht; //1ms
    private Object rpisa; //1mm
    private Object ava; //1cm^2
    private Object vmax; //1m/s
    private Object dvi; //vmax_lvot, vmax_pr  //1-, 1m/s, 1m/s
    private Object eoa; //csa_lvot, vti_lvot, vti_pr //1cm^2, 1mm, 1-, 1-
    private Object at; //1ms

}
