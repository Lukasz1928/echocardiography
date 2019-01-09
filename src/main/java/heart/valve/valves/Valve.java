package heart.valve.valves;

import heart.parameters.BoundedSizeParameter;
import heart.parameters.Parameter;
import heart.valve.leaflets.LeafletsType;
import heart.valve.regurgiation.RegurgiationLevel;
import heart.valve.type.ValveType;

@SuppressWarnings("WeakerAccess")
public abstract class Valve {
    private Parameter gradient; //mmHg
    private ValveType type; // -
    private RegurgiationLevel regurgiationLevel; // -
    private LeafletsType leafletsType; // -

    public Valve() {
        this.gradient = new BoundedSizeParameter(2, "mmHg");
        this.type = ValveType.NATIVE;
        this.regurgiationLevel = RegurgiationLevel.NONE;
        this.leafletsType = null;
    }
}
