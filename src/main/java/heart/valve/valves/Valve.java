package heart.valve.valves;

import heart.valve.gradient.Gradient;
import heart.valve.leaflets.LeafletsType;

@SuppressWarnings("WeakerAccess")
public abstract class Valve {
    private Gradient gradient;
    private int regurgiationLevel;
    private LeafletsType leafletsType;
}
