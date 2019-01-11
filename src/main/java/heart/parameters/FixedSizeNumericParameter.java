package heart.parameters;

import heart.parameters.exceptions.IncorrectSizeException;
import java.util.List;

public class FixedSizeNumericParameter extends NumericParameter {
    private int size;

    public FixedSizeNumericParameter(int size) {
        super();
        this.size = size;
    }

    public FixedSizeNumericParameter(int size, String unit) {
        super(unit);
        this.size = size;
    }

    @Override
    public void setParameters(List<Double> parameters) throws IncorrectSizeException {
        if(parameters.size() != this.size) {
            throw new IncorrectSizeException();
        }
        this.parameters = parameters;
    }
}
