package gui.custom.control;

import gui.custom.labels.LatexLabel;
import javafx.beans.NamedArg;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import java.io.IOException;

public class TabWithLabel extends Tab {

    @FXML
    private LatexLabel label;

    public TabWithLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/control/TabWithLabel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public TabWithLabel(@NamedArg("label") String label) {
        this();
        setupLabel(label);
    }

    private void setupLabel(String label) {
        this.label.setText(label);
    }
}
