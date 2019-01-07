package heart.valve.valves;

import heart.valve.gradient.Gradient;
import heart.valve.leaflets.LeafletsType;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class MitralValve extends Valve {
    private double mapse; //1, mm
    private double mva; //1, cm^2
    private Object vc; //1, mm
    private Object rpisa; //1, mm
    private Object ero; //1, cm^2
    private Object dvi; // vti_pr, vti_lvot //1- 1- 1-
    private Object eoa; // vti_pr, vti_lvot, csa_lvot // 1cm^2 1- 1- 1mm
    private Object pht; //1ms
    private Object vmax; //1m/s
}
