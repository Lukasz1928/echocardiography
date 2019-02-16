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
    public Tab parametersGeneralTab;
    @FXML
    public Tab parametersMitralValveTab;
    @FXML
    public Tab parametersAorticValveTab;
    @FXML
    public Tab parametersTricuspidValveTab;
    @FXML
    public Tab parametersPulmonaryValveTab;

    /* controllers */
    @FXML
    public GeneralParametersPaneController parametersGeneralPaneController;
    @FXML
    public MitralValvePaneController parametersMitralValvePaneController;
    @FXML
    public AorticValvePaneController parametersAorticValvePaneController;
    @FXML
    public TricuspidValvePaneController parametersTricuspidValvePaneController;
    @FXML
    public PulmonaryValvePaneController parametersPulmonaryValvePaneController;


    public void initialize() {
        setupLabels();
    }

    private void setupLabels() {
        LatexRenderer lr = new LatexRenderer();
        try {
            // TODO: Setup tabs labels
            throw new FormatException(); // TODO: Remove this line!!!
        }
        catch(FormatException e) {
            // TODO: Show some kind of information about error
        }
    }
}
