package gui.custom.input.simple;

import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.beans.NamedArg;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class RadioButtonInputArea extends AnchorPane {

    @FXML
    public ImageView label;
    @FXML
    public RadioButton input;

    public RadioButtonInputArea(@NamedArg("label") String labelText) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/simple/RadioButtonInputArea.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch(IOException exception) {
            throw new RuntimeException(exception);
        }
        setupLabel(labelText);
        // TODO: update css (much) later
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);
    }

    public void initialize() {

    }

    private void setupLabel(String label) {
        try {
            this.label.setImage(new LatexRenderer().latexToImage(label));
        } catch(FormatException e) {
            //TODO:
            System.out.println("exception");
        }
    }
}
