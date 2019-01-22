package heart;

import heart.components.HeartParameters;
import heart.components.valve.valves.*;

public class Heart {
    private HeartParameters parameters;
    private Valve mitralValve;
    private Valve aorticValve;
    private Valve pulmonaryValve;
    private Valve tricuspidValve;

    public Heart() {
        this.parameters = new HeartParameters();
        this.mitralValve = new MitralValve();
        this.aorticValve = new AorticValve();
        this.pulmonaryValve = new PulmonaryValve();
        this.tricuspidValve = new TricuspidValve();
    }

    public HeartParameters getParameters() {
        return parameters;
    }

    public Valve getTricuspidValve() {
        return tricuspidValve;
    }

    public Valve getPulmonaryValve() {
        return pulmonaryValve;
    }

    public Valve getAorticValve() {
        return aorticValve;
    }

    public Valve getMitralValve() {
        return mitralValve;
    }
}
