package heart.valve.valves;

import heart.parameters.FixedSizeParameter;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.MitralValveLeaflets;
import lombok.Builder;

public class MitralValve extends Valve {
    private Parameter mapse;
    private Parameter mva;
    private Parameter vc;
    private Parameter rpisa;
    private Parameter ero;

    private Parameter dvi;
    private Parameter vtiPr;
    private Parameter vtiLvot;

    private Parameter eoa;
    private Parameter csaLvot;

    private Parameter pht;
    private Parameter vmax;

    public MitralValve() {
        super();
        this.leafletsType = MitralValveLeaflets.RIGHT;

        this.mapse = new FixedSizeParameter(1, "mm");
        this.mva = new FixedSizeParameter(1, "cm^2");
        this.vc = new FixedSizeParameter(1, "mm");
        this.rpisa = new FixedSizeParameter(1, "mm");
        this.ero = new FixedSizeParameter(1, "cm^2");

        this.dvi = new FixedSizeParameter(1);
        this.vtiPr = new FixedSizeParameter(1);
        this.vtiLvot = new FixedSizeParameter(1);

        this.eoa = new FixedSizeParameter(1, "cm^2");
        this.csaLvot = new FixedSizeParameter(1, "mm");

        this.pht = new FixedSizeParameter(1, "ms");
        this.vmax = new FixedSizeParameter(1, "m/s");
    }
}
