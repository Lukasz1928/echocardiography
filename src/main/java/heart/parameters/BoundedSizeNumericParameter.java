package heart.parameters;

import heart.parameters.exceptions.IncorrectSizeException;
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

    public BoundedSizeNumericParameter(int lowerSizeBound) {
        super();
        this.lowerSizeBound = lowerSizeBound;
        this.upperSizeBound = null;
    }

    public BoundedSizeNumericParameter(int lowerSizeBound, String unit) {
        super(unit);
        this.lowerSizeBound = lowerSizeBound;
        this.upperSizeBound = null;
    }

    @Override
    public void setParameters(List<Double> parameters) throws IncorrectSizeException {
        if(!inBounds(parameters.size())) {
            throw new IncorrectSizeException();
        }
        this.parameters = parameters;
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
