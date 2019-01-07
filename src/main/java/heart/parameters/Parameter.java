package heart.parameters;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.List;

public class Parameter {
    private List<Double> parameters;

    public Parameter(List<Double> params) {
        this.setParameters(params);
    }

    public Parameter(double... args) {
        this.setParameters(args);
    }

    public void setParameters(List<Double> params) {
        this.parameters = params;
    }

    public void setParameters(double... args) {
        this.parameters = Arrays.asList(ArrayUtils.toObject(args));
    }

    public List<Double> getParameters() {
        return this.parameters;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Double param : this.parameters) {
            builder.append(param).append("/");
        }
        return builder.toString();
    }
}
