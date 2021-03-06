package gui.custom.input.simple;

import gui.custom.labels.LatexLabel;
import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.beans.NamedArg;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import java.io.IOException;
import java.time.LocalDate;

public class DateInput extends HBox {

    @FXML
    private LatexLabel label;
    @FXML
    private DatePicker input;

    public DateInput() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/simple/DateInput.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        setupStyle();
        reset();
    }

    public DateInput(@NamedArg("label") String label) {
        this();
        setupLabel(label);
    }

    public DateInput(@NamedArg("label") String label, @NamedArg("description") String description) {
        this();
        setupLabel(label);
        setupDescription(description);
    }

    public void reset() {
        this.setValue(LocalDate.now());
    }

    public void setValue(LocalDate date) {
        this.input.setValue(date);
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
}
