package heart.valve.valves;

import heart.parameters.BoundedSizeNumericParameter;
import heart.parameters.FixedSizeNumericParameter;
import heart.parameters.NumericParameter;
import heart.parameters.exceptions.ParameterException;
import heart.valve.leaflets.leaflets.TricuspidValveLeaflets;

import java.util.List;

public class TricuspidValve extends Valve {
    private NumericParameter rvsp;
    private NumericParameter ivc;
    private NumericParameter tapse;
    private NumericParameter vc;

    public TricuspidValve() {

        super();

        this.setLeafletsType(TricuspidValveLeaflets.RIGHT);

        this.rvsp = new FixedSizeNumericParameter(1, "mmHg");
        this.ivc = new BoundedSizeNumericParameter(1, 2, "mm");
        this.tapse = new FixedSizeNumericParameter(1, "mm");
        this.vc = new FixedSizeNumericParameter(1, "mm");
    }

    public NumericParameter getRvsp() {
        return rvsp;
    }

    public void setRvsp(List<Double> rvsp) throws ParameterException {
        this.rvsp.setParameters(rvsp);
    }

    public NumericParameter getIvc() {
        return ivc;
    }

    public void setIvc(List<Double> ivc) throws ParameterException {
        this.ivc.setParameters(ivc);
    }

    public NumericParameter getTapse() {
        return tapse;
    }

    public void setTapse(List<Double> tapse) throws ParameterException {
        this.tapse.setParameters(tapse);
    }

    public NumericParameter getVc() {
        return vc;
    }

    public void setVc(List<Double> vc) throws ParameterException {
        this.vc.setParameters(vc);
    }
}
