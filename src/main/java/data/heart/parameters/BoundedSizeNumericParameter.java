package data.heart.parameters;

import data.heart.parameters.exceptions.IncorrectSizeException;
import data.heart.parameters.exceptions.ParameterException;
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
        return value >= this.lowerSizeBound && value <= this.upperSizeBound;
    }
}
