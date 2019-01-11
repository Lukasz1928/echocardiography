package heart.parameters;

import heart.parameters.exceptions.ParameterException;
import java.util.List;

public class NumericParameter {
    protected List<Double> parameters;
    protected String unit;

    public NumericParameter() {
        this.parameters = null;
        this.unit = "";
    }

    public NumericParameter(String unit) {
        this.unit = unit;
    }

    public void setParameters(List<Double> parameters) throws ParameterException {
        this.parameters = parameters;
    }

    public List<Double> getParameters() {
        return this.parameters;
    }

    @Override
    public String toString() {
        if(this.parameters == null || this.parameters.size() == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for(Double param : this.parameters) {
            if(param == param.intValue()) {
                builder.append(param.intValue());
            }
            else{
                builder.append(param);
            }
            builder.append("/");
        }
        builder.deleteCharAt(builder.lastIndexOf("/"));
        builder.append(this.unit);
        return builder.toString();
    }
}
