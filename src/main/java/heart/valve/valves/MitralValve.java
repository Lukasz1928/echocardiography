package heart.valve.valves;

import heart.valve.gradient.Gradient;
import heart.valve.leaflets.LeafletsType;
import lombok.Builder;

// TODO: Change Object types to real ones
@Builder
public class MitralValve extends Valve {
    private double mapse;
    private double mva;
    private Object vc;
    private Object rpisa;
    private Object ero;
    private Object dvi; // vti_pr, vti_lvot
    private Object eoa; // vti_pr, vti_lvot, csa_lvot
    private Object pht;
    private Object vmax;
}
