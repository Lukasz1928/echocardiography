package heart.valve.valves;

import heart.parameters.BoundedSizeParameter;
import heart.parameters.FixedSizeParameter;
import heart.parameters.IncorrectSizeException;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.TricuspidValveLeaflets;
import java.util.List;

public class TricuspidValve extends Valve {
    private Parameter rvsp;
    private Parameter ivc;
    private Parameter tapse;
    private Parameter vc;

    public TricuspidValve() {

        super();

        this.setLeafletsType(TricuspidValveLeaflets.RIGHT);

        this.rvsp = new FixedSizeParameter(1, "mmHg");
        this.ivc = new BoundedSizeParameter(1, 2, "mm");
        this.tapse = new FixedSizeParameter(1, "mm");
        this.vc = new FixedSizeParameter(1, "mm");
    }

    public Parameter getRvsp() {
        return rvsp;
    }

    public void setRvsp(List<Double> rvsp) throws IncorrectSizeException {
        this.rvsp.setParameters(rvsp);
    }

    public Parameter getIvc() {
        return ivc;
    }

    public void setIvc(List<Double> ivc) throws IncorrectSizeException {
        this.ivc.setParameters(ivc);
    }

    public Parameter getTapse() {
        return tapse;
    }

    public void setTapse(List<Double> tapse) throws IncorrectSizeException {
        this.tapse.setParameters(tapse);
    }

    public Parameter getVc() {
        return vc;
    }

    public void setVc(List<Double> vc) throws IncorrectSizeException {
        this.vc.setParameters(vc);
    }
}
