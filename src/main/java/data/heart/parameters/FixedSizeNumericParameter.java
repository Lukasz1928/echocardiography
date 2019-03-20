package data.heart.parameters;

import data.heart.parameters.exceptions.IncorrectSizeException;
import data.heart.parameters.exceptions.ParameterException;
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
    public void setParameters(List<Double> parameters) throws ParameterException {
        if(parameters.size() != this.size) {
            throw new IncorrectSizeException();
        }
        super.setParameters(parameters);
    }
}
