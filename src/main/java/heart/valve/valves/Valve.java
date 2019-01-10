package heart.valve.valves;

import heart.parameters.BoundedSizeParameter;
import heart.parameters.IncorrectSizeException;
import heart.parameters.Parameter;
import heart.valve.leaflets.LeafletsType;
import heart.valve.regurgiation.RegurgiationLevel;
import heart.valve.type.ValveType;
import java.util.List;

public abstract class Valve {
    private Parameter gradient;
    private ValveType type;
    private RegurgiationLevel regurgiationLevel;
    private LeafletsType leafletsType;

    public Valve() {
        this.gradient = new BoundedSizeParameter(2, "mmHg");
        this.type = ValveType.NATIVE;
        this.regurgiationLevel = RegurgiationLevel.NONE;
        this.leafletsType = null;
    }

    public Parameter getGradient() {
        return gradient;
    }

    public void setGradient(List<Double> gradient) throws IncorrectSizeException {
        this.gradient.setParameters(gradient);
    }

    public ValveType getType() {
        return type;
    }

    public void setType(ValveType type) {
        this.type = type;
    }

    public RegurgiationLevel getRegurgiationLevel() {
        return regurgiationLevel;
    }

    public void setRegurgiationLevel(RegurgiationLevel regurgiationLevel) {
        this.regurgiationLevel = regurgiationLevel;
    }

    public LeafletsType getLeafletsType() {
        return leafletsType;
    }

    public void setLeafletsType(LeafletsType leafletsType) {
        this.leafletsType = leafletsType;
    }
}
