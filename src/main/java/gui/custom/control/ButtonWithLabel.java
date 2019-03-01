package gui.custom.control;

import gui.custom.labels.LatexLabel;
import javafx.beans.NamedArg;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import java.io.IOException;

public class ButtonWithLabel extends Button {

    @FXML
    private LatexLabel label;

    public ButtonWithLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/control/ButtonWithLabel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public ButtonWithLabel(@NamedArg("label") String label) {
        this();
        setupLabel(label);
    }

    private void setupLabel(String label) {
        this.label.setText(label);
    }
}
