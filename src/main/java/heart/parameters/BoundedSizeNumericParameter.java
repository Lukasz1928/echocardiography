package heart.parameters;

import heart.parameters.exceptions.IncorrectSizeException;
import heart.parameters.exceptions.ParameterException;
import java.util.List;

public class BoundedSizeNumericParameter extends NumericParameter {
    private Integer lowerSizeBound;
    private Integer upperSizeBound;

    public BoundedSizeNumericParameter(int lowerSizeBound, int upperSizeBound) {
        super();
        this.lowerSizeBound = lowerSizeBound;
        this.upperSizeBound = upperSizeBound;
    }

    public BoundedSizeNumericParameter(int lowerSizeBound, int upperSizeBound, String unit) {
        super(unit);
        this.lowerSizeBound = lowerSizeBound;
        this.upperSizeBound = upperSizeBound;
    }

    @Override
    public void setParameters(List<Double> parameters) throws ParameterException {
        if(!inBounds(parameters.size())) {
            throw new IncorrectSizeException();
        }
        super.setParameters(parameters);
    }

    private boolean inBounds(int value) {
        if(this.lowerSizeBound != null && this.lowerSizeBound > value) {
            return false;
        }
        if(this.upperSizeBound != null && this.upperSizeBound < value) {
            return false;
        }
        return true;
    }
}
