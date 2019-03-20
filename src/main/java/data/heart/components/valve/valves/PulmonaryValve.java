package data.heart.components.valve.valves;

import data.heart.components.valve.leaflets.LeafletsType;
import data.heart.parameters.FixedSizeNumericParameter;
import data.heart.parameters.NumericParameter;
import data.heart.parameters.exceptions.IncorrectTypeException;
import data.heart.parameters.exceptions.ParameterException;
import data.heart.components.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import java.util.List;

public class PulmonaryValve extends Valve {
    private NumericParameter act;

    public PulmonaryValve() {
        super();
        try {
            this.setLeafletsType(PulmonaryValveLeaflets.RIGHT);
        }
        catch(ParameterException e) {
            //cannot be thrown
        }

        this.act = new FixedSizeNumericParameter(1, "ms");
    }

    public NumericParameter getAct() {
        return act;
    }

    public void setAct(List<Double> act) throws ParameterException {
        this.act.setParameters(act);
    }

    @Override
    public void setLeafletsType(LeafletsType leafletsType) throws ParameterException {
        if(!(leafletsType instanceof PulmonaryValveLeaflets)) {
            throw new IncorrectTypeException();
        }
        super.setLeafletsType(leafletsType);
    }
}
