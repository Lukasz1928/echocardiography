package heart.parameters;

import java.text.DecimalFormat;

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
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(5);
        for(Double param : this.parameters) {
            if(param == param.intValue()) {
                builder.append(param.intValue());
            } else {
                builder.append(df.format(param).replace(',', '.'));
            }
            builder.append("/");
        }
        builder.deleteCharAt(builder.lastIndexOf("/"));
        builder.append(this.unit);
        return builder.toString();
    }
}
