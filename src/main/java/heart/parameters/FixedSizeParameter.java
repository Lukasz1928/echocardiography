package heart.parameters;

import java.util.List;

public class FixedSizeParameter extends Parameter{
    private int size;

    public FixedSizeParameter(int size) {
        super();
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
