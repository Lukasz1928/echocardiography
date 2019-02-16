package gui.controllers.parameters.tabs;

import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.util.ResourceBundle;

public class AorticValvePaneController {

    private ResourceBundle labelsResourceBundle;

    public AorticValvePaneController(ResourceBundle resourceBundle) {
        this.labelsResourceBundle = resourceBundle;
    }

    public AorticValvePaneController() {
        this.labelsResourceBundle = ResourceBundle.getBundle("gui.text.guiLabels");
    }

    /* labels */
    @FXML
    public ImageView aorticLeafletsLabel;
    @FXML
    public ImageView aorticRegurgiationLabel;
    @FXML
    public ImageView aorticGradientLabel;
    @FXML
    public ImageView aorticVcLabel;
    @FXML
    public ImageView aorticIalvotLabel;
    @FXML
    public ImageView aorticPhtLabel;
    @FXML
    public ImageView aorticRpisaLabel;
    @FXML
    public ImageView aorticAvaLabel;
    @FXML
    public ImageView aorticVmaxLabel;
    @FXML
    public ImageView aorticDviDviLabel;

    /* input fields */
    @FXML
    public RadioButton aorticTypeNativeInput;
    @FXML
    public RadioButton aorticTypeBiologicalInput;
    @FXML
    public RadioButton aorticTypeArtificialInput;
    @FXML
    public ComboBox aorticLeafletsInput;
    @FXML
    public ComboBox aorticRegurgiationInput;
    @FXML
    public TextField aorticGradientInput;
    @FXML
    public TextField aorticVcInput;
    @FXML
    public TextField aorticIalvotInput;
    @FXML
    public TextField aorticPhtInput;
    @FXML
    public TextField aorticRpisaInput;
    @FXML
    public TextField aorticAvaInput;
    @FXML
    public TextField aorticVmaxInput;

    public void initialize() {
        setupLabels();
    }

    private void setupLabels() {

        LatexRenderer lr = new LatexRenderer();

        // TODO: Setup radio buttons labels
        try {
            this.aorticLeafletsLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-leaflets")));
            this.aorticRegurgiationLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-regurgiation")));
            this.aorticGradientLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-gradient")));
            this.aorticVcLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-vc")));
            this.aorticIalvotLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-ialvot")));
            this.aorticPhtLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-pht")));
            this.aorticRpisaLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-rpisa")));
            this.aorticAvaLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-ava")));
            this.aorticVmaxLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-vmax")));
            this.aorticGradientLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-gradient")));
            this.aorticDviDviLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("aortic-dvi")));
        }
        catch(FormatException e) {
            System.out.println("dupa");
            // TODO
        }
    }
}
