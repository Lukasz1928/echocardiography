package heart.parameters;

public class DescriptiveParameter implements Parameter {
    private String description;

    public String getParameters() {
        return this.description;
    }

    public void setParameters(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
