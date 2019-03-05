package gui.custom.labels;

import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.beans.NamedArg;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class LatexLabel extends AnchorPane {

    @FXML
    public ImageView label;

    public LatexLabel(@NamedArg("text") String text) {
        this();
        setText(text);
    }

    public LatexLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/labels/LatexLabel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);
    }

    public void setText(String text) {
        LatexRenderer lr = new LatexRenderer();
        try {
            this.label.setImage(lr.latexToImage(text));
        }
        catch(FormatException e) {
            // TODO
            System.out.println("dupa");
        }
    }
}
