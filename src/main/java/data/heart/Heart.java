package data.heart;

import data.heart.components.HeartParameters;
import data.heart.components.valve.valves.*;


public class Heart {
    private HeartParameters parameters;
    private Valve mitralValve;
    private Valve aorticValve;
    private Valve pulmonaryValve;
    private Valve tricuspidValve;

    public Heart() {
    }

    public void setParameters(HeartParameters parameters) {
        this.parameters = parameters;
    }

    public HeartParameters getParameters() {
        return parameters;
    }

    public void setMitralValve(Valve valve) {
        this.mitralValve = valve;
    }

    public Valve getMitralValve() {
        return mitralValve;
    }

    public void setAorticValve(Valve valve) {
        this.aorticValve = valve;
    }

    public Valve getAorticValve() {
        return aorticValve;
    }

    public void setPulmonaryValve(Valve valve) {
        this.pulmonaryValve = valve;
    }

    public Valve getPulmonaryValve() {
        return pulmonaryValve;
    }

    public void setTricuspidValve(Valve valve) {
        this.tricuspidValve = valve;
    }

    public Valve getTricuspidValve() {
        return tricuspidValve;
    }

}
