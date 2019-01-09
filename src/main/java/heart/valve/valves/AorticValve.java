package heart.valve.valves;

import heart.parameters.FixedSizeParameter;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.AorticValveLeaflets;
import lombok.Builder;

@Builder
public class AorticValve extends Valve {

    private Parameter vc;
    private Parameter ialvot;
    private Parameter pht;
    private Parameter rpisa;
    private Parameter ava;
    private Parameter vmax;

    private Parameter dvi;
    private Parameter vmaxLvot;
    private Parameter vmaxPr;

    private Parameter eoa;
    private Parameter csaLvot;
    private Parameter vtiLvot;
    private Parameter vtiPr;

    private Parameter at;

    public AorticValve() {
        super();

        this.leafletsType = AorticValveLeaflets.RIGHT;

        this.vc = new FixedSizeParameter(1, "mm");
        this.ialvot = new FixedSizeParameter(1, "%");
        this.pht = new FixedSizeParameter(1, "ms");
        this.rpisa = new FixedSizeParameter(1, "mm");
        this.ava = new FixedSizeParameter(1, "cm^2");
        this.vmax = new FixedSizeParameter(1, "m/s");

        this.dvi = new FixedSizeParameter(1);
        this.vmaxLvot = new FixedSizeParameter(1, "m/s");
        this.vmaxPr = new FixedSizeParameter(1, "m/s");

        this.eoa = new FixedSizeParameter(1, "cm^2");
        this.csaLvot = new FixedSizeParameter(1, "mm");
        this.vtiLvot = new FixedSizeParameter(1);
        this.vtiPr = new FixedSizeParameter(1);

        this.at = new FixedSizeParameter(1, "ms");
    }
}
