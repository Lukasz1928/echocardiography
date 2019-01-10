package heart.valve.valves;

import heart.parameters.FixedSizeParameter;
import heart.parameters.IncorrectSizeException;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.AorticValveLeaflets;
import java.util.List;

public class AorticValve extends Valve {

    private Parameter vc;
    private Parameter iaLvot;
    private Parameter pht;
    private Parameter rpisa;
    private Parameter ava;
    private Parameter vmax;

    private Parameter dvi;
    private Parameter vmaxLvot;
    private Parameter vmaxPr;

    private Parameter eoa;
    private Parameter csaLvot;
    private Parameter vtiLvot;
    private Parameter vtiPr;

    private Parameter at;

    public AorticValve() {
        super();

        this.setLeafletsType(AorticValveLeaflets.RIGHT);

        this.vc = new FixedSizeParameter(1, "mm");
        this.iaLvot = new FixedSizeParameter(1, "%");
        this.pht = new FixedSizeParameter(1, "ms");
        this.rpisa = new FixedSizeParameter(1, "mm");
        this.ava = new FixedSizeParameter(1, "cm^2");
        this.vmax = new FixedSizeParameter(1, "m/s");

        this.dvi = new FixedSizeParameter(1);
        this.vmaxLvot = new FixedSizeParameter(1, "m/s");
        this.vmaxPr = new FixedSizeParameter(1, "m/s");

        this.eoa = new FixedSizeParameter(1, "cm^2");
        this.csaLvot = new FixedSizeParameter(1, "mm");
        this.vtiLvot = new FixedSizeParameter(1);
        this.vtiPr = new FixedSizeParameter(1);

        this.at = new FixedSizeParameter(1, "ms");
    }

    public Parameter getVc() {
        return vc;
    }

    public void setVc(List<Double> vc) throws IncorrectSizeException {
        this.vc.setParameters(vc);
    }

    public Parameter getIaLvot() {
        return iaLvot;
    }

    public void setIaLvot(List<Double> iaLvot) throws IncorrectSizeException {
        this.iaLvot.setParameters(iaLvot);
    }

    public Parameter getPht() {
        return pht;
    }

    public void setPht(List<Double> pht) throws IncorrectSizeException {
        this.pht.setParameters(pht);
    }

    public Parameter getRpisa() {
        return rpisa;
    }

    public void setRpisa(List<Double> rpisa) throws IncorrectSizeException {
        this.rpisa.setParameters(rpisa);
    }

    public Parameter getAva() {
        return ava;
    }

    public void setAva(List<Double> ava) throws IncorrectSizeException {
        this.ava.setParameters(ava);
    }

    public Parameter getVmax() {
        return vmax;
    }

    public void setVmax(List<Double> vmax) throws IncorrectSizeException {
        this.vmax.setParameters(vmax);
    }

    public Parameter getDvi() {
        return dvi;
    }

    public void setDvi(List<Double> dvi) throws IncorrectSizeException {
        this.dvi.setParameters(dvi);
    }

    public Parameter getVmaxLvot() {
        return vmaxLvot;
    }

    public void setVmaxLvot(List<Double> vmaxLvot) throws IncorrectSizeException {
        this.vmaxLvot.setParameters(vmaxLvot);
    }

    public Parameter getVmaxPr() {
        return vmaxPr;
    }

    public void setVmaxPr(List<Double> vmaxPr) throws IncorrectSizeException {
        this.vmaxPr.setParameters(vmaxPr);
    }

    public Parameter getEoa() {
        return eoa;
    }

    public void setEoa(List<Double> eoa) throws IncorrectSizeException {
        this.eoa.setParameters(eoa);
    }

    public Parameter getCsaLvot() {
        return csaLvot;
    }

    public void setCsaLvot(List<Double> csaLvot) throws IncorrectSizeException {
        this.csaLvot.setParameters(csaLvot);
    }

    public Parameter getVtiLvot() {
        return vtiLvot;
    }

    public void setVtiLvot(List<Double> vtiLvot) throws IncorrectSizeException {
        this.vtiLvot.setParameters(vtiLvot);
    }

    public Parameter getVtiPr() {
        return vtiPr;
    }

    public void setVtiPr(List<Double> vtiPr) throws IncorrectSizeException {
        this.vtiPr.setParameters(vtiPr);
    }

    public Parameter getAt() {
        return at;
    }

    public void setAt(List<Double> at) throws IncorrectSizeException {
        this.at.setParameters(at);
    }
}
