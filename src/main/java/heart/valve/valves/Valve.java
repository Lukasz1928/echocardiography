package heart.valve.valves;

import heart.valve.gradient.Gradient;
import heart.valve.leaflets.LeafletsType;
import heart.valve.regurgiation.RegurgiationLevel;
import heart.valve.type.ValveType;

@SuppressWarnings("WeakerAccess")
public abstract class Valve {
    private Gradient gradient;
    private ValveType type;
    private RegurgiationLevel regurgiationLevel;
    private LeafletsType leafletsType;
}
