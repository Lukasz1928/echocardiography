package gui.custom.input.simple;

import gui.custom.labels.LatexLabel;
import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.beans.NamedArg;
import javafx.beans.property.BooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.io.IOException;

public class RadioButtonInput extends HBox {

    @FXML
    private LatexLabel label;
    @FXML
    private RadioButton input;

    public RadioButtonInput() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/simple/RadioButtonInput.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        setupStyle();
    }

    public RadioButtonInput(@NamedArg("label") String label) {
        this();
        setupLabel(label);
    }

    public RadioButtonInput(@NamedArg("label") String label, @NamedArg("description") String description) {
        this();
        setupLabel(label);
        setupDescription(description);
    }

    private void setupLabel(String label) {
        this.label.setText(label);
    }

    private void setupDescription(String description) {
        Tooltip.install(this, new Tooltip(description));
    }

    private void setupStyle() {
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);
    }

    public void setToggleGroup(ToggleGroup tg) {
        this.input.setToggleGroup(tg);
    }

    public void setSelected(Boolean selected) {
        this.input.setSelected(selected);
    }

    public BooleanProperty selectedProperty() {
        return this.input.selectedProperty();
    }
}
