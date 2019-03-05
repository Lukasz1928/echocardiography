package gui.custom.input.simple;

import gui.custom.labels.LatexLabel;
import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.beans.NamedArg;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import java.io.IOException;

public class ComboBoxInput extends HBox {

    @FXML
    public LatexLabel label;
    @FXML
    public ComboBox input;

    public ComboBoxInput() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/simple/ComboBoxInput.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch(IOException exception) {
            throw new RuntimeException(exception);
        }
        setupStyle();
    }

    public ComboBoxInput(@NamedArg("label") String label) {
        this();
        setupLabel(label);
    }

    public ComboBoxInput(@NamedArg("label") String label, @NamedArg("description") String description) {
        this();
        setupLabel(label);
        setupDescription(description);
    }

    private void setupStyle() {
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);
    }

    private void setupLabel(String label) {
        this.label.setText(label);
    }

    private void setupDescription(String description) {
        Tooltip.install(this, new Tooltip(description));
    }
}
