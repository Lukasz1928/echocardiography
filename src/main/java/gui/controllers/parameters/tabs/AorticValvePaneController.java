package gui.controllers.parameters.tabs;

import gui.controllers.parameters.ControllerWithParameters;
import gui.custom.input.composite.ValveTypeInput;
import gui.custom.input.simple.ComboBoxInput;
import gui.custom.input.simple.TextInput;
import data.heart.components.valve.valves.Valve;
import javafx.fxml.FXML;

public class AorticValvePaneController implements ControllerWithParameters<Valve> {

    @FXML
    private ValveTypeInput valveTypeInput;
    @FXML
    private ComboBoxInput leafletsInput;
    @FXML
    private ComboBoxInput regurgiationInput;
    @FXML
    private TextInput gradientInput;
    @FXML
    private TextInput vcInput;
    @FXML
    private TextInput ialvotInput;
    @FXML
    private TextInput phtInput;
    @FXML
    private TextInput rpisaInput;
    @FXML
    private TextInput avaInput;
    @FXML
    private TextInput vmaxInput;
    @FXML
    private TextInput dviDviInput;
    @FXML
    private TextInput dviVtiprInput;
    @FXML
    private TextInput dviVtilvotInput;
    @FXML
    private TextInput eoaEoaInput;
    @FXML
    private TextInput eoaVtiprInput;
    @FXML
    private TextInput eoaVtilvotInput;
    @FXML
    private TextInput eoaCsalvotInput;
    @FXML
    private TextInput atInput;

    public void initialize() {

    }

    @Override
    public Valve getParameters() {
        return null;
    }
}
