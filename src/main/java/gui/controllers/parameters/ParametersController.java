package gui.controllers.parameters;

import gui.controllers.parameters.tabs.AorticValvePaneController;
import gui.controllers.parameters.tabs.GeneralParametersPaneController;
import gui.controllers.parameters.tabs.MitralValvePaneController;
import gui.controllers.parameters.tabs.PulmonaryValvePaneController;
import gui.controllers.parameters.tabs.TricuspidValvePaneController;
import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import java.util.ResourceBundle;

public class ParametersController {

    private ResourceBundle labelsResourceBundle;

    public ParametersController(ResourceBundle resourceBundle) {
        this.labelsResourceBundle = resourceBundle;
    }

    public ParametersController() {
        this.labelsResourceBundle = ResourceBundle.getBundle("gui.text.guiLabels");
    }

    /* tabs */
    @FXML
    private Tab parametersGeneralTab;
    @FXML
    private Tab parametersMitralValveTab;
    @FXML
    private Tab parametersAorticValveTab;
    @FXML
    private Tab parametersTricuspidValveTab;
    @FXML
    private Tab parametersPulmonaryValveTab;

    /* controllers */
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
