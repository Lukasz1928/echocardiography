package gui.controllers.parameters.tabs;

import gui.controllers.parameters.ControllerWithParameters;
import gui.custom.input.composite.ValveTypeInput;
import gui.custom.input.simple.ComboBoxInput;
import gui.custom.input.simple.TextInput;
import data.heart.components.valve.valves.Valve;
import javafx.fxml.FXML;

public class TricuspidValvePaneController implements ControllerWithParameters<Valve> {

    @FXML
    private ValveTypeInput valveTypeInput;
    @FXML
    private ComboBoxInput leafletsInput;
    @FXML
    private ComboBoxInput regurgiationInput;
    @FXML
    private TextInput gradientInput;
    @FXML
    private TextInput rvspInput;
    @FXML
    private TextInput ivcInput;
    @FXML
    private TextInput vcInput;

    public void initialize() {

    }

    @Override
    public Valve getParameters() {
        return null;
    }
}
