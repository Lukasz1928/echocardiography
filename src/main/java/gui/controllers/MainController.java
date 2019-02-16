package gui.controllers;


import gui.controllers.basic_data.BasicDataController;
import gui.controllers.description.DescriptionController;
import gui.controllers.parameters.ParametersController;
import javafx.fxml.FXML;

public class MainController {
    /* controllers */
    @FXML
    public ParametersController parametersPaneController;
    @FXML
    public DescriptionController descriptionPaneController;
    @FXML
    public BasicDataController basicDataPaneController;

    public void initialize() {
    }

}
