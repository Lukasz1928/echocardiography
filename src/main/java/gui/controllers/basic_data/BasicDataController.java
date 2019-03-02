package gui.controllers.basic_data;

import gui.custom.input.simple.DateInput;
import gui.custom.input.simple.TextInput;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class BasicDataController {

    @FXML
    private TextInput patientInput;
    @FXML
    private TextInput patientIdInput;
    @FXML
    private DateInput dateInput;
    @FXML
    private AnchorPane basicDataPane;

    @FXML
    private void initialize() {
        setupStyle();
        setupDefaultValues();
    }

    private void setupDefaultValues() {
        this.dateInput.reset();
    }

    private void setupStyle() {
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.basicDataPane.setStyle(cssLayout);
    }
}
