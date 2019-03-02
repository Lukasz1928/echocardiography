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
    private ImageView aorticLeafletsLabel;
    @FXML
    private ImageView aorticRegurgiationLabel;
    @FXML
    private ImageView aorticGradientLabel;
    @FXML
    private ImageView aorticVcLabel;
    @FXML
    private ImageView aorticIalvotLabel;
    @FXML
    private ImageView aorticPhtLabel;
    @FXML
    private ImageView aorticRpisaLabel;
    @FXML
    private ImageView aorticAvaLabel;
    @FXML
    private ImageView aorticVmaxLabel;
    @FXML
    private ImageView aorticDviDviLabel;

    /* input fields */
    @FXML
    private RadioButton aorticTypeNativeInput;
    @FXML
    private RadioButton aorticTypeBiologicalInput;
    @FXML
    private RadioButton aorticTypeArtificialInput;
    @FXML
    private ComboBox aorticLeafletsInput;
    @FXML
    private ComboBox aorticRegurgiationInput;
    @FXML
    private TextField aorticGradientInput;
    @FXML
    private TextField aorticVcInput;
    @FXML
    private TextField aorticIalvotInput;
    @FXML
    private TextField aorticPhtInput;
    @FXML
    private TextField aorticRpisaInput;
    @FXML
    private TextField aorticAvaInput;
    @FXML
    private TextField aorticVmaxInput;

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
