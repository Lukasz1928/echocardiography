package heart.parameters;

import heart.parameters.exceptions.ParameterException;
import heart.parameters.exceptions.ParameterNotSetException;
import java.util.List;

public abstract class Parameter<T> {

    protected List<T> parameters = null;
    protected boolean isSet = false;

    public abstract String toString();

    public boolean isSet() {
        return this.isSet;
    }

    public List<T> getParameters() throws ParameterException {
        if(!this.isSet) {
            throw new ParameterNotSetException();
        }
        return this.parameters;
    }
    public void setParameters(List<T> parameters) throws ParameterException {
        this.parameters = parameters;
        this.isSet = true;
    }
}
