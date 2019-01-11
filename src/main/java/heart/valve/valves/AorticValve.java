package heart.valve.valves;

import heart.parameters.FixedSizeNumericParameter;
import heart.parameters.NumericParameter;
import heart.parameters.exceptions.ParameterException;
import heart.valve.leaflets.leaflets.AorticValveLeaflets;
import java.util.List;

public class AorticValve extends Valve {

    private NumericParameter vc;
    private NumericParameter iaLvot;
    private NumericParameter pht;
    private NumericParameter rpisa;
    private NumericParameter ava;
    private NumericParameter vmax;

    private NumericParameter dvi;
    private NumericParameter vmaxLvot;
    private NumericParameter vmaxPr;

    private NumericParameter eoa;
    private NumericParameter csaLvot;
    private NumericParameter vtiLvot;
    private NumericParameter vtiPr;

    private NumericParameter at;

    public AorticValve() {
        super();

        this.setLeafletsType(AorticValveLeaflets.RIGHT);

        this.vc = new FixedSizeNumericParameter(1, "mm");
        this.iaLvot = new FixedSizeNumericParameter(1, "%");
        this.pht = new FixedSizeNumericParameter(1, "ms");
        this.rpisa = new FixedSizeNumericParameter(1, "mm");
        this.ava = new FixedSizeNumericParameter(1, "cm^2");
        this.vmax = new FixedSizeNumericParameter(1, "m/s");

        this.dvi = new FixedSizeNumericParameter(1);
        this.vmaxLvot = new FixedSizeNumericParameter(1, "m/s");
        this.vmaxPr = new FixedSizeNumericParameter(1, "m/s");

        this.eoa = new FixedSizeNumericParameter(1, "cm^2");
        this.csaLvot = new FixedSizeNumericParameter(1, "mm");
        this.vtiLvot = new FixedSizeNumericParameter(1);
        this.vtiPr = new FixedSizeNumericParameter(1);

        this.at = new FixedSizeNumericParameter(1, "ms");
    }

    public NumericParameter getVc() {
        return vc;
    }

    public void setVc(List<Double> vc) throws ParameterException {
        this.vc.setParameters(vc);
    }

    public NumericParameter getIaLvot() {
        return iaLvot;
    }

    public void setIaLvot(List<Double> iaLvot) throws ParameterException {
        this.iaLvot.setParameters(iaLvot);
    }

    public NumericParameter getPht() {
        return pht;
    }

    public void setPht(List<Double> pht) throws ParameterException {
        this.pht.setParameters(pht);
    }

    public NumericParameter getRpisa() {
        return rpisa;
    }

    public void setRpisa(List<Double> rpisa) throws ParameterException {
        this.rpisa.setParameters(rpisa);
    }

    public NumericParameter getAva() {
        return ava;
    }

    public void setAva(List<Double> ava) throws ParameterException {
        this.ava.setParameters(ava);
    }

    public NumericParameter getVmax() {
        return vmax;
    }

    public void setVmax(List<Double> vmax) throws ParameterException {
        this.vmax.setParameters(vmax);
    }

    public NumericParameter getDvi() {
        return dvi;
    }

    public void setDvi(List<Double> dvi) throws ParameterException {
        this.dvi.setParameters(dvi);
    }

    public NumericParameter getVmaxLvot() {
        return vmaxLvot;
    }

    public void setVmaxLvot(List<Double> vmaxLvot) throws ParameterException {
        this.vmaxLvot.setParameters(vmaxLvot);
    }

    public NumericParameter getVmaxPr() {
        return vmaxPr;
    }

    public void setVmaxPr(List<Double> vmaxPr) throws ParameterException {
        this.vmaxPr.setParameters(vmaxPr);
    }

    public NumericParameter getEoa() {
        return eoa;
    }

    public void setEoa(List<Double> eoa) throws ParameterException {
        this.eoa.setParameters(eoa);
    }

    public NumericParameter getCsaLvot() {
        return csaLvot;
    }

    public void setCsaLvot(List<Double> csaLvot) throws ParameterException {
        this.csaLvot.setParameters(csaLvot);
    }

    public NumericParameter getVtiLvot() {
        return vtiLvot;
    }

    public void setVtiLvot(List<Double> vtiLvot) throws ParameterException {
        this.vtiLvot.setParameters(vtiLvot);
    }

    public NumericParameter getVtiPr() {
        return vtiPr;
    }

    public void setVtiPr(List<Double> vtiPr) throws ParameterException {
        this.vtiPr.setParameters(vtiPr);
    }

    public NumericParameter getAt() {
        return at;
    }

    public void setAt(List<Double> at) throws ParameterException {
        this.at.setParameters(at);
    }
}
