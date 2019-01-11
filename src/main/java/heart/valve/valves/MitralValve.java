package heart.valve.valves;

import heart.parameters.FixedSizeNumericParameter;
import heart.parameters.exceptions.IncorrectSizeException;
import heart.parameters.NumericParameter;
import heart.parameters.exceptions.ParameterException;
import heart.valve.leaflets.leaflets.MitralValveLeaflets;
import java.util.List;

public class MitralValve extends Valve {
    private NumericParameter mapse;
    private NumericParameter mva;
    private NumericParameter vc;
    private NumericParameter rpisa;
    private NumericParameter ero;

    private NumericParameter dvi;
    private NumericParameter vtiPr;
    private NumericParameter vtiLvot;

    private NumericParameter eoa;
    private NumericParameter csaLvot;

    private NumericParameter pht;
    private NumericParameter vmax;

    public MitralValve() {
        super();
        this.setLeafletsType(MitralValveLeaflets.RIGHT);

        this.mapse = new FixedSizeNumericParameter(1, "mm");
        this.mva = new FixedSizeNumericParameter(1, "cm^2");
        this.vc = new FixedSizeNumericParameter(1, "mm");
        this.rpisa = new FixedSizeNumericParameter(1, "mm");
        this.ero = new FixedSizeNumericParameter(1, "cm^2");

        this.dvi = new FixedSizeNumericParameter(1);
        this.vtiPr = new FixedSizeNumericParameter(1);
        this.vtiLvot = new FixedSizeNumericParameter(1);

        this.eoa = new FixedSizeNumericParameter(1, "cm^2");
        this.csaLvot = new FixedSizeNumericParameter(1, "mm");

        this.pht = new FixedSizeNumericParameter(1, "ms");
        this.vmax = new FixedSizeNumericParameter(1, "m/s");
    }

    public NumericParameter getMapse() {
        return mapse;
    }

    public void setMapse(List<Double> mapse) throws ParameterException {
        this.mapse.setParameters(mapse);
    }

    public NumericParameter getMva() {
        return mva;
    }

    public void setMva(List<Double> mva) throws ParameterException {
        this.mva.setParameters(mva);
    }

    public NumericParameter getVc() {
        return vc;
    }

    public void setVc(List<Double> vc) throws ParameterException {
        this.vc.setParameters(vc);
    }

    public NumericParameter getRpisa() {
        return rpisa;
    }

    public void setRpisa(List<Double> rpisa) throws ParameterException {
        this.rpisa.setParameters(rpisa);
    }

    public NumericParameter getEro() {
        return ero;
    }

    public void setEro(List<Double> ero) throws ParameterException {
        this.ero.setParameters(ero);
    }

    public NumericParameter getDvi() {
        return dvi;
    }

    public void setDvi(List<Double> dvi) throws ParameterException {
        this.dvi.setParameters(dvi);
    }

    public NumericParameter getVtiPr() {
        return vtiPr;
    }

    public void setVtiPr(List<Double> vtiPr) throws ParameterException {
        this.vtiPr.setParameters(vtiPr);
    }

    public NumericParameter getVtiLvot() {
        return vtiLvot;
    }

    public void setVtiLvot(List<Double> vtiLvot) throws ParameterException {
        this.vtiLvot.setParameters(vtiLvot);
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

    public NumericParameter getPht() {
        return pht;
    }

    public void setPht(List<Double> pht) throws ParameterException {
        this.pht.setParameters(pht);
    }

    public NumericParameter getVmax() {
        return vmax;
    }

    public void setVmax(List<Double> vmax) throws ParameterException {
        this.vmax.setParameters(vmax);
    }
}
