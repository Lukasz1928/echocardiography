package gui.custom.input.compound;

import gui.custom.input.simple.RadioButtonInputArea;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class ValveTypeInputArea extends AnchorPane {

    @FXML
    public RadioButtonInputArea nativeInput;
    @FXML
    public RadioButtonInputArea artificialInput;
    @FXML
    public RadioButtonInputArea biologicalInput;

    public ValveTypeInputArea() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/compound/ValveTypeInputArea.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch(IOException exception) {
            throw new RuntimeException(exception);
        }
        // TODO: update css (much) later
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);
    }

    public void initialize() {
        // TODO
    }
}
