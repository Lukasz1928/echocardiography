package gui.custom.input.composite;

import gui.custom.input.simple.RadioButtonInput;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.util.ResourceBundle;

public class ValveTypeInput extends AnchorPane {

    @FXML
    private RadioButtonInput nativeInput;
    @FXML
    private RadioButtonInput artificialInput;
    @FXML
    private RadioButtonInput biologicalInput;

    private ToggleGroup toggleGroup;

    public ValveTypeInput() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/composite/ValveTypeInput.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.setResources(ResourceBundle.getBundle("gui.text.labels.guiLabels"));
        try {
            fxmlLoader.load();
        }
        catch(IOException exception) {
            throw new RuntimeException(exception);
        }
        setupStyle();
        setupToggleGroup();
        setupDefaultValues();
    }

    private void setupToggleGroup() {
        this.toggleGroup = new ToggleGroup();
        this.nativeInput.setToggleGroup(this.toggleGroup);
        this.artificialInput.setToggleGroup(this.toggleGroup);
        this.biologicalInput.setToggleGroup(this.toggleGroup);
    }

    private void setupStyle() {
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);
    }

    private void setupDefaultValues() {
        this.nativeInput.setSelected(true);
    }

    public ReadOnlyObjectProperty<Toggle> selectedToggleProperty() {
        return this.toggleGroup.selectedToggleProperty();
    }
}
