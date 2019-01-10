package heart.valve.valves;

import heart.parameters.FixedSizeParameter;
import heart.parameters.IncorrectSizeException;
import heart.parameters.Parameter;
import heart.valve.leaflets.leaflets.MitralValveLeaflets;
import java.util.List;

public class MitralValve extends Valve {
    private Parameter mapse;
    private Parameter mva;
    private Parameter vc;
    private Parameter rpisa;
    private Parameter ero;

    private Parameter dvi;
    private Parameter vtiPr;
    private Parameter vtiLvot;

    private Parameter eoa;
    private Parameter csaLvot;

    private Parameter pht;
    private Parameter vmax;

    public MitralValve() {
        super();
        this.setLeafletsType(MitralValveLeaflets.RIGHT);

        this.mapse = new FixedSizeParameter(1, "mm");
        this.mva = new FixedSizeParameter(1, "cm^2");
        this.vc = new FixedSizeParameter(1, "mm");
        this.rpisa = new FixedSizeParameter(1, "mm");
        this.ero = new FixedSizeParameter(1, "cm^2");

        this.dvi = new FixedSizeParameter(1);
        this.vtiPr = new FixedSizeParameter(1);
        this.vtiLvot = new FixedSizeParameter(1);

        this.eoa = new FixedSizeParameter(1, "cm^2");
        this.csaLvot = new FixedSizeParameter(1, "mm");

        this.pht = new FixedSizeParameter(1, "ms");
        this.vmax = new FixedSizeParameter(1, "m/s");
    }

    public Parameter getMapse() {
        return mapse;
    }

    public void setMapse(List<Double> mapse) throws IncorrectSizeException {
        this.mapse.setParameters(mapse);
    }

    public Parameter getMva() {
        return mva;
    }

    public void setMva(List<Double> mva) throws IncorrectSizeException {
        this.mva.setParameters(mva);
    }

    public Parameter getVc() {
        return vc;
    }

    public void setVc(List<Double> vc) throws IncorrectSizeException {
        this.vc.setParameters(vc);
    }

    public Parameter getRpisa() {
        return rpisa;
    }

    public void setRpisa(List<Double> rpisa) throws IncorrectSizeException {
        this.rpisa.setParameters(rpisa);
    }

    public Parameter getEro() {
        return ero;
    }

    public void setEro(List<Double> ero) throws IncorrectSizeException {
        this.ero.setParameters(ero);
    }

    public Parameter getDvi() {
        return dvi;
    }

    public void setDvi(List<Double> dvi) throws IncorrectSizeException {
        this.dvi.setParameters(dvi);
    }

    public Parameter getVtiPr() {
        return vtiPr;
    }

    public void setVtiPr(List<Double> vtiPr) throws IncorrectSizeException {
        this.vtiPr.setParameters(vtiPr);
    }

    public Parameter getVtiLvot() {
        return vtiLvot;
    }

    public void setVtiLvot(List<Double> vtiLvot) throws IncorrectSizeException {
        this.vtiLvot.setParameters(vtiLvot);
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

    public Parameter getPht() {
        return pht;
    }

    public void setPht(List<Double> pht) throws IncorrectSizeException {
        this.pht.setParameters(pht);
    }

    public Parameter getVmax() {
        return vmax;
    }

    public void setVmax(List<Double> vmax) throws IncorrectSizeException {
        this.vmax.setParameters(vmax);
    }
}
