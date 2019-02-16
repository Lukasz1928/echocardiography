package gui.controllers.basic_data;

import gui.custom.input.simple.DateInput;
import gui.custom.input.simple.TextInput;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import java.util.ResourceBundle;

public class BasicDataController {

    @FXML
    public TextInput patientInput;
    @FXML
    public TextInput patientIdInput;
    @FXML
    public DateInput dateInput;
    @FXML
    public AnchorPane basicDataPane;

    private ResourceBundle labelsResourceBundle;

    public BasicDataController(ResourceBundle resourceBundle) {
        this.labelsResourceBundle = resourceBundle;
    }

    public BasicDataController() {
        this.labelsResourceBundle = ResourceBundle.getBundle("gui.text.guiLabels");
    }

    @FXML
    private void initialize() {
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.basicDataPane.setStyle(cssLayout);
    }
}
