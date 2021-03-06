package heart.components.valve.valves;

import heart.parameters.BoundedSizeNumericParameter;
import heart.parameters.NumericParameter;
import heart.parameters.exceptions.ParameterException;
import heart.components.valve.leaflets.LeafletsType;
import heart.components.valve.regurgiation.RegurgiationLevel;
import heart.components.valve.type.ValveType;
import java.util.List;

public abstract class Valve {
    private NumericParameter gradient;
    private ValveType type;
    private RegurgiationLevel regurgiationLevel;
    private LeafletsType leafletsType;

    public Valve() {
        this.gradient = new BoundedSizeNumericParameter(1,2, "mmHg");
        this.type = ValveType.NATIVE;
        this.regurgiationLevel = RegurgiationLevel.NONE;
        this.leafletsType = null;
    }

    public NumericParameter getGradient() {
        return gradient;
    }

    public void setGradient(List<Double> gradient) throws ParameterException {
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

    public void setLeafletsType(LeafletsType leafletsType) throws ParameterException {
        this.leafletsType = leafletsType;
    }
}
