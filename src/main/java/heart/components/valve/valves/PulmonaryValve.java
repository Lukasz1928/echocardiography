package heart.components.valve.valves;

import heart.parameters.FixedSizeNumericParameter;
import heart.parameters.NumericParameter;
import heart.parameters.exceptions.ParameterException;
import heart.components.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import java.util.List;

public class PulmonaryValve extends Valve {
    private NumericParameter act;

    public PulmonaryValve() {
        super();
        this.setLeafletsType(PulmonaryValveLeaflets.RIGHT);

        this.act = new FixedSizeNumericParameter(1, "ms");
    }

    public NumericParameter getAct() {
        return act;
    }

    public void setAct(List<Double> act) throws ParameterException {
        this.act.setParameters(act);
    }
}
