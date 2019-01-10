package heart.valve.valves;

import heart.parameters.FixedSizeParameter;
import heart.parameters.IncorrectSizeException;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import java.util.List;

public class PulmonaryValve extends Valve {
    private Parameter act;

    public PulmonaryValve() {
        super();
        this.setLeafletsType(PulmonaryValveLeaflets.RIGHT);

        this.act = new FixedSizeParameter(1, "ms");
    }

    public Parameter getAct() {
        return act;
    }

    public void setAct(List<Double> act) throws IncorrectSizeException {
        this.act.setParameters(act);
    }
}
