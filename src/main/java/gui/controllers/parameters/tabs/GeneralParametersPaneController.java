package gui.controllers.parameters.tabs;

import gui.controllers.parameters.ControllerWithParameters;
import gui.custom.input.simple.ComboBoxInput;
import gui.custom.input.simple.TextInput;
import data.heart.components.HeartParameters;
import javafx.fxml.FXML;


public class GeneralParametersPaneController implements ControllerWithParameters<HeartParameters> {

    @FXML
    private TextInput leftVentricleInput;
    @FXML
    private TextInput rightVentricleInput;
    @FXML
    private TextInput interventricualarSeptumInput;
    @FXML
    private TextInput backWallInput;
    @FXML
    private TextInput leftAutriumInput;
    @FXML
    private TextInput rightAutriumInput;
    @FXML
    private TextInput ascendingAortaInput;
    @FXML
    private TextInput pulmonaryTrunkInput;
    @FXML
    private TextInput bulbInput;
    @FXML
    public TextInput stjInput;
    @FXML
    public TextInput contractilityInput;
    @FXML
    private TextInput efInput;
    @FXML
    private TextInput mapseInput;
    @FXML
    private TextInput tapseInput;
    @FXML
    private TextInput eaInput;
    @FXML
    private TextInput dtInput;
    @FXML
    private ComboBoxInput pericardiumInput;
    @FXML
    private TextInput pericardiumFluidInput;

    public void initialize() {

    }

    @Override
    public HeartParameters getParameters() {
        return null;
    }
}
