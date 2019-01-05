package heart.valve.valves;

import heart.valve.type.ValveType;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class AorticValve extends Valve {

    private Object vc;
    private Object ialvot;
    private Object pht;
    private Object rpisa;
    private Object ava;
    private Object vmax;
    private Object dvi; //vmax_lvot, vmax_pr
    private Object eoa; //csa_lvot, vti_lvot, vti_pr
    private Object at;

}
