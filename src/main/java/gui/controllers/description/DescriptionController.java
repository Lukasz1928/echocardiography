package gui.controllers.description;

import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.util.ResourceBundle;

public class DescriptionController {

    private ResourceBundle labelsResourceBundle;

    public DescriptionController(ResourceBundle resourceBundle) {
        this.labelsResourceBundle = resourceBundle;
    }

    public DescriptionController() {
        this.labelsResourceBundle = ResourceBundle.getBundle("gui.text.guiLabels");
    }

    /* labels */
    @FXML
    public ImageView descriptionSaveButtonLabel;
    @FXML
    public ImageView descriptionPreviewButtonLabel;
    @FXML
    public ImageView descriptionGenerateButtonLabel;

    /* controls */
    @FXML
    public TextArea descriptionInput;
    @FXML
    public Button descriptionSaveButton;
    @FXML
    public Button descriptionPreviewButton;
    @FXML
    public Button descriptionGenerateButton;

    @FXML
    private void initialize() {
        this.setupLabels();
    }

    private void setupLabels() {
        LatexRenderer lr = new LatexRenderer();
        try {
            this.descriptionSaveButtonLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("button-save")));
            this.descriptionPreviewButtonLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("button-preview")));
            this.descriptionGenerateButtonLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("button-generate")))   ;
        }
        catch(FormatException e) {
            // TODO: Show some kind of information about error
        }
    }
}
