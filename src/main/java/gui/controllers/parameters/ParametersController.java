package gui.controllers.parameters;

import gui.controllers.parameters.tabs.AorticValvePaneController;
import gui.controllers.parameters.tabs.GeneralParametersPaneController;
import gui.controllers.parameters.tabs.MitralValvePaneController;
import gui.controllers.parameters.tabs.PulmonaryValvePaneController;
import gui.controllers.parameters.tabs.TricuspidValvePaneController;
import gui.custom.control.TabWithLabel;
import data.heart.Heart;
import javafx.fxml.FXML;

public class ParametersController implements ControllerWithParameters<Heart> {
    @FXML
    private TabWithLabel parametersGeneralTab;
    @FXML
    private TabWithLabel parametersMitralValveTab;
    @FXML
    private TabWithLabel parametersAorticValveTab;
    @FXML
    private TabWithLabel parametersTricuspidValveTab;
    @FXML
    private TabWithLabel parametersPulmonaryValveTab;

    @FXML
    private GeneralParametersPaneController parametersGeneralPaneController;
    @FXML
    private MitralValvePaneController parametersMitralValvePaneController;
    @FXML
    private AorticValvePaneController parametersAorticValvePaneController;
    @FXML
    private TricuspidValvePaneController parametersTricuspidValvePaneController;
    @FXML
    private PulmonaryValvePaneController parametersPulmonaryValvePaneController;

    public void initialize() {

    }

    @Override
    public Heart getParameters() {
        Heart h = new Heart();
        h.setParameters(this.parametersGeneralPaneController.getParameters());
        h.setMitralValve(this.parametersMitralValvePaneController.getParameters());
        h.setAorticValve(this.parametersAorticValvePaneController.getParameters());
        h.setTricuspidValve(this.parametersTricuspidValvePaneController.getParameters());
        h.setPulmonaryValve(this.parametersPulmonaryValvePaneController.getParameters());
        return h;
    }

}
