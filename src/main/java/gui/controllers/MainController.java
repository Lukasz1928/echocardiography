package gui.controllers;


import gui.controllers.basic_data.BasicDataController;
import gui.controllers.description.DescriptionController;
import gui.controllers.parameters.ParametersController;
import data.heart.Heart;
import javafx.fxml.FXML;

public class MainController {

    private Heart heart;
    private BasicExaminationData basicData;

    @FXML
    private ParametersController parametersPaneController;
    @FXML
    private DescriptionController descriptionPaneController;
    @FXML
    private BasicDataController basicDataPaneController;

    public void initialize() {

    }

    private void setupModel() {

    }
}
