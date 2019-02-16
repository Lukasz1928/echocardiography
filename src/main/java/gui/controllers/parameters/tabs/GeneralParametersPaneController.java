package gui.controllers.parameters.tabs;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class GeneralParametersPaneController {
    @FXML
    public TextField leftVentricleInput;

    public void dupa() {
        System.out.println("dupa");
    }

    /*public GeneralParametersPaneController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/main/parameters/input_panes/generalParametersPane.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch(IOException exception) {
            throw new RuntimeException(exception);
        }
    }*/
}
