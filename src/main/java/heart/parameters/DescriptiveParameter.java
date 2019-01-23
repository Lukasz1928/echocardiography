package heart.parameters;

public class DescriptiveParameter extends Parameter<String> {

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(String param : this.parameters) {
            if(!param.equals("")) {
                builder.append(param).append("\n");
            }
        }
        if(builder.length() > 0) {
            builder.deleteCharAt(builder.lastIndexOf("\n"));
        }
        return builder.toString();
    }
}
