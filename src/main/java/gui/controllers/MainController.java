package gui.controllers;


import gui.controllers.basic_data.BasicDataController;
import gui.controllers.description.DescriptionController;
import gui.controllers.parameters.ParametersController;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private ParametersController parametersPaneController;
    @FXML
    private DescriptionController descriptionPaneController;
    @FXML
    private BasicDataController basicDataPaneController;
}
