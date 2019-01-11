package heart.basic;

import heart.parameters.BoundedSizeNumericParameter;
import heart.parameters.FixedSizeNumericParameter;

public class HeartParameters {
    private BoundedSizeNumericParameter leftVentricle; //2mm
    private BoundedSizeNumericParameter rightVerntricle; //2mm
    private Object leftAutrium; //1|3mm + 1cm^2
    private BoundedSizeNumericParameter rightAutrium; //2mm
    private BoundedSizeNumericParameter interventricularSeptum; //2mm
    private BoundedSizeNumericParameter backWall; //2mm
    private FixedSizeNumericParameter ascendingAorta; //1mm
    private FixedSizeNumericParameter bulb; //1mm
    private FixedSizeNumericParameter stj; //1mm
    private FixedSizeNumericParameter pulmonaryArtery; //1mm
    private Object pericardium; //-
    private Object contractility; //-
    private FixedSizeNumericParameter ef; //1%
    private FixedSizeNumericParameter ea; //1-
}
