package gui.controllers.basic_data;

import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.util.ResourceBundle;

public class BasicDataController {

    private ResourceBundle labelsResourceBundle;

    public BasicDataController(ResourceBundle resourceBundle) {
        this.labelsResourceBundle = resourceBundle;
    }

    public BasicDataController() {
        this.labelsResourceBundle = ResourceBundle.getBundle("gui.text.guiLabels");
    }

    /* Labels */
    @FXML
    private ImageView patientLabel;
    @FXML
    private ImageView patientIdLabel;
    @FXML
    private ImageView dateLabel;

    /* Input fields */
    @FXML
    private TextField patientInput;
    @FXML
    private TextField patientIdInput;
    @FXML
    private DatePicker dateInput;

    @FXML
    private void initialize() {
        this.setupLabels();
    }

    private void setupLabels() {
        LatexRenderer lr = new LatexRenderer();
        try {
            this.patientLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("patient-data")));
            this.patientIdLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("patient-id")));
            this.dateLabel.setImage(lr.latexToImage(this.labelsResourceBundle.getString("patient-id")));
        }
        catch(FormatException e) {
            //
        }
    }

}
