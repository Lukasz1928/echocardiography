package gui.controllers.parameters;

import gui.controllers.parameters.tabs.AorticValvePaneController;
import gui.controllers.parameters.tabs.GeneralParametersPaneController;
import gui.controllers.parameters.tabs.MitralValvePaneController;
import gui.controllers.parameters.tabs.PulmonaryValvePaneController;
import gui.controllers.parameters.tabs.TricuspidValvePaneController;
import gui.custom.control.TabWithLabel;
import javafx.fxml.FXML;

public class ParametersController {
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

}
