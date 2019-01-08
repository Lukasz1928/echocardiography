package heart.parameters;

import java.util.List;

public class Parameter {
    protected List<Double> parameters;

    public Parameter() {
        this.parameters = null;
    }

    public void setParameters(List<Double> params) throws IncorrectSizeException {
        this.parameters = params;
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
        return builder.substring(0, builder.length() - 1);
    }
}
