package heart.valve.valves;

import heart.valve.ValveType;
import lombok.Builder;

@Builder
public class AorticValve extends Valve {

    private ValveType type;
    private AorticValve leaflets;
    private double vc;
    private double ialvot;
    private double pht;
    private double rpisa;
    private double ava;
    private double vmax;
    private double dvi;
    private double eoa;
    private double at;

}
