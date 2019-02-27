package gui.custom.help;

import javafx.beans.NamedArg;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class FieldDescription extends ImageView {

    public FieldDescription() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/help/FieldDescription.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        this.setVisible(false);
    }

    public FieldDescription(@NamedArg("text") String text) {
        this();
        this.setup(text);
    }

    private void setup(String text) {
        if(text != null && !text.matches("\\s*")) {
            this.setVisible(true);
            this.setupImage();
            this.setupTooltip(text);
        }
    }

    private void setupImage() {
        this.setImage(new Image("/gui/graphics/help_icon.png", 15, 15, false, true, false));
    }

    private void setupTooltip(String text) {
        Tooltip tp = new Tooltip(text);
        Tooltip.install(this, tp);
    }

    public void setText(String text) {
        this.setup(text);
    }
}
