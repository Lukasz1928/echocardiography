package heart.parameters;

public class NumericParameter extends Parameter<Double> {
    protected String unit;

    public NumericParameter() {
        this.unit = "";
    }

    public NumericParameter(String unit) {
        this.unit = unit;
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
            } else {
                builder.append(param);
            }
            builder.append("/");
        }
        builder.deleteCharAt(builder.lastIndexOf("/"));
        builder.append(this.unit);
        return builder.toString();
    }
}
