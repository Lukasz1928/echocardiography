package gui.controllers.parameters.tabs;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PulmonaryValvePaneController {

    /*labels */
    @FXML
    public ImageView pulmonaryLeafletsLabel;
    @FXML
    public ImageView pulmonaryRegurgiationLabel;
    @FXML
    public ImageView pulmonaryGradientLabel;
    @FXML
    public ImageView pulmonaryActLabel;
    // TODO: add radio button labels

    /* inputs */
    @FXML
    public RadioButton pulmonaryTypeNativeInput;
    @FXML
    public RadioButton pulmonaryTypeBiologicalInput;
    @FXML
    public RadioButton pulmonaryTypeArtificialInput;
    @FXML
    public ComboBox pulmonaryLeafletsInput;
    @FXML
    public ComboBox pulmonaryRegurgiationInput;
    @FXML
    public TextField pulmonaryGradientInput;
    @FXML
    public TextField pulmonaryActInput;

    public void initialize() {

    }
}
