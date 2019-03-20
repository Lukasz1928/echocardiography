package data.heart.components;

import data.heart.parameters.BoundedSizeNumericParameter;
import data.heart.parameters.DescriptiveParameter;
import data.heart.parameters.FixedSizeNumericParameter;
import data.heart.parameters.NumericParameter;
import data.heart.parameters.exceptions.ParameterException;
import java.util.List;

public class HeartParameters {
    private NumericParameter leftVentricle;
    private NumericParameter rightVerntricle;

    private NumericParameter leftAutriumSize;
    private NumericParameter leftAutriumArea;

    private NumericParameter rightAutrium;
    private NumericParameter interventricularSeptum;
    private NumericParameter backWall;
    private NumericParameter ascendingAorta;
    private NumericParameter bulb;
    private NumericParameter stj;
    private NumericParameter pulmonaryArtery;
    private DescriptiveParameter pericardium;
    private DescriptiveParameter contractility;
    private NumericParameter ef;
    private NumericParameter ea;

    public HeartParameters() {
        this.leftVentricle = new BoundedSizeNumericParameter(1, 2, "mm");
        this.rightVerntricle = new BoundedSizeNumericParameter(1, 2, "mm");

        this.leftAutriumSize = new BoundedSizeNumericParameter(1, 3, "mm");
        this.leftAutriumArea = new FixedSizeNumericParameter(1, "cm^2");

        this.rightAutrium = new BoundedSizeNumericParameter(1, 2, "mm");
        this.interventricularSeptum = new BoundedSizeNumericParameter(1, 2, "mm");
        this.backWall = new BoundedSizeNumericParameter(1, 2, "mm");
        this.ascendingAorta = new FixedSizeNumericParameter(1, "mm");
        this.bulb = new FixedSizeNumericParameter(1, "mm");
        this.stj = new FixedSizeNumericParameter(1, "mm");
        this.pulmonaryArtery = new FixedSizeNumericParameter(1, "mm");
        this.pericardium = new DescriptiveParameter();
        this.contractility = new DescriptiveParameter();
        this.ef = new FixedSizeNumericParameter(1, "%");
        this.ea = new FixedSizeNumericParameter(1);
    }

    public NumericParameter getLeftVentricle() {
        return leftVentricle;
    }

    public void setLeftVentricle(List<Double> leftVentricle) throws ParameterException {
        this.leftVentricle.setParameters(leftVentricle);
    }

    public NumericParameter getRightVerntricle() {
        return rightVerntricle;
    }

    public void setRightVerntricle(List<Double> rightVerntricle) throws ParameterException {
        this.rightVerntricle.setParameters(rightVerntricle);
    }

    public NumericParameter getLeftAutriumSize() {
        return leftAutriumSize;
    }

    public void setLeftAutriumSize(List<Double> leftAutriumSize) throws ParameterException {
        this.leftAutriumSize.setParameters(leftAutriumSize);
    }

    public NumericParameter getLeftAutriumArea() {
        return leftAutriumArea;
    }

    public void setLeftAutriumArea(List<Double> leftAutriumArea) throws ParameterException {
        this.leftAutriumArea.setParameters(leftAutriumArea);
    }

    public NumericParameter getRightAutrium() {
        return rightAutrium;
    }

    public void setRightAutrium(List<Double> rightAutrium) throws ParameterException {
        this.rightAutrium.setParameters(rightAutrium);
    }

    public NumericParameter getInterventricularSeptum() {
        return interventricularSeptum;
    }

    public void setInterventricularSeptum(List<Double> interventricularSeptum) throws ParameterException {
        this.interventricularSeptum.setParameters(interventricularSeptum);
    }

    public NumericParameter getBackWall() {
        return backWall;
    }

    public void setBackWall(List<Double> backWall) throws ParameterException {
        this.backWall.setParameters(backWall);
    }

    public NumericParameter getAscendingAorta() {
        return ascendingAorta;
    }

    public void setAscendingAorta(List<Double> ascendingAorta) throws ParameterException {
        this.ascendingAorta.setParameters(ascendingAorta);
    }

    public NumericParameter getBulb() {
        return bulb;
    }

    public void setBulb(List<Double> bulb) throws ParameterException {
        this.bulb.setParameters(bulb);
    }

    public NumericParameter getStj() {
        return stj;
    }

    public void setStj(List<Double> stj) throws ParameterException {
        this.stj.setParameters(stj);
    }

    public NumericParameter getPulmonaryArtery() {
        return pulmonaryArtery;
    }

    public void setPulmonaryArtery(List<Double> pulmonaryArtery) throws ParameterException {
        this.pulmonaryArtery.setParameters(pulmonaryArtery);
    }

    public DescriptiveParameter getPericardium() {
        return pericardium;
    }

    public void setPericardium(List<String> pericardium) throws ParameterException {
        this.pericardium.setParameters(pericardium);
    }

    public DescriptiveParameter getContractility() {
        return contractility;
    }

    public void setContractility(List<String> contractility) throws ParameterException {
        this.contractility.setParameters(contractility);
    }

    public NumericParameter getEf() {
        return ef;
    }

    public void setEf(List<Double> ef) throws ParameterException {
        this.ef.setParameters(ef);
    }

    public NumericParameter getEa() {
        return ea;
    }

    public void setEa(List<Double> ea) throws ParameterException {
        this.ea.setParameters(ea);
    }
}
