package data.heart.components.valve.valves;

import data.heart.components.valve.leaflets.LeafletsType;
import data.heart.parameters.BoundedSizeNumericParameter;
import data.heart.parameters.FixedSizeNumericParameter;
import data.heart.parameters.NumericParameter;
import data.heart.parameters.exceptions.IncorrectTypeException;
import data.heart.parameters.exceptions.ParameterException;
import data.heart.components.valve.leaflets.leaflets.TricuspidValveLeaflets;

import java.util.List;

public class TricuspidValve extends Valve {
    private NumericParameter rvsp;
    private NumericParameter ivc;
    private NumericParameter tapse;
    private NumericParameter vc;

    public TricuspidValve() {

        super();
        try {
            this.setLeafletsType(TricuspidValveLeaflets.RIGHT);
        }
        catch(ParameterException e) {
            //wont be thrown
        }

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

    @Override
    public void setLeafletsType(LeafletsType leafletsType) throws ParameterException {
        if(!(leafletsType instanceof TricuspidValveLeaflets)) {
            throw new IncorrectTypeException();
        }
        super.setLeafletsType(leafletsType);
    }
}
