package gui.controllers.parameters.tabs;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PulmonaryValvePaneController {

    /*labels */
    @FXML
    private ImageView pulmonaryLeafletsLabel;
    @FXML
    private ImageView pulmonaryRegurgiationLabel;
    @FXML
    private ImageView pulmonaryGradientLabel;
    @FXML
    private ImageView pulmonaryActLabel;
    // TODO: add radio button labels

    /* inputs */
    @FXML
    private RadioButton pulmonaryTypeNativeInput;
    @FXML
    private RadioButton pulmonaryTypeBiologicalInput;
    @FXML
    private RadioButton pulmonaryTypeArtificialInput;
    @FXML
    private ComboBox pulmonaryLeafletsInput;
    @FXML
    private ComboBox pulmonaryRegurgiationInput;
    @FXML
    private TextField pulmonaryGradientInput;
    @FXML
    private TextField pulmonaryActInput;

    public void initialize() {

    }
}
