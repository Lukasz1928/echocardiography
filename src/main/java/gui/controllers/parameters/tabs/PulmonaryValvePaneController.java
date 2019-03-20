package gui.controllers.parameters.tabs;

import gui.controllers.parameters.ControllerWithParameters;
import gui.custom.input.composite.ValveTypeInput;
import gui.custom.input.simple.ComboBoxInput;
import gui.custom.input.simple.TextInput;
import data.heart.components.valve.valves.Valve;
import javafx.fxml.FXML;

public class PulmonaryValvePaneController implements ControllerWithParameters<Valve> {

    @FXML
    private ValveTypeInput valveTypeInput;
    @FXML
    private ComboBoxInput leafletsInput;
    @FXML
    private ComboBoxInput regurgiationInput;
    @FXML
    private TextInput gradientInput;
    @FXML
    private TextInput actInput;

    public void initialize() {

    }

    @Override
    public Valve getParameters() {
        return null;
    }
}
