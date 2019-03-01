package gui.custom.input.simple;

import gui.custom.labels.LatexLabel;
import javafx.beans.NamedArg;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import java.io.IOException;

public class TextInput extends HBox {

    @FXML
    private LatexLabel label;
    @FXML
    private TextField input;

    public TextInput() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/simple/TextInput.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public TextInput(@NamedArg("label") String label) {
        this();
        setupStyle();
        setupLabel(label);
    }

    public TextInput(@NamedArg("label") String label, @NamedArg("prompt") String prompt) {
        this();
        setupStyle();
        setupLabel(label);
        setupPrompt(prompt);
    }

    public TextInput(@NamedArg("label") String label, @NamedArg("prompt") String prompt, @NamedArg("description") String description) {
        this();
        setupStyle();
        setupLabel(label);
        setupPrompt(prompt);
        setupDescription(description);
    }

    private void setupStyle() {
        // TODO: update css (much) later
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);

    }

    private void setupLabel(String label) {
        this.label.setText(label);
    }

    private void setupPrompt(String prompt) {
        this.input.setStyle("-fx-prompt-text-fill: derive(-fx-control-inner-background, -30%);");
        this.input.setPromptText(prompt);
    }

    private void setupDescription(String description) {
        Tooltip.install(this, new Tooltip(description));
    }

    public StringProperty textProperty() {
        return this.input.textProperty();
    }
}
