package gui.controllers;

import gui.utils.LatexRenderer;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controller {
    public ImageView generalLeftVentricleLabel;
    public TextField leftVentricleInput;
    public ImageView generalRightVentricleLabel;
    public TextField generalRightVentricleInput;
    public ImageView generalInterventricularSeptumLabel;
    public TextField generalInterventricularSeptumInput;
    public Tab parametersGeneralTab;
    public ImageView generalBackWallLabel;
    public TextField generalBackWallInput;
    public ImageView generalLeftAutriumLabel;
    public TextField generalLeftAutriumInput;
    public ImageView generalRightAutriumLabel;
    public TextField generalRightAutriumInput;
    public ImageView generalAscendingAortaLabel;
    public TextField generalAscendingAortaInput;
    public ImageView generalPulmonaryTrunkLabel;
    public TextField generalTrunkInput;
    public ImageView generalEfLabel;
    public TextField generalEfInput;
    public ImageView generalEaLabel;
    public TextField generalEaInput;
    public ImageView generalDtLabel;
    public TextField generalDtInput;
    public ImageView generalPericariumTypeLabel;
    public ComboBox generalPericardiumTypeInput;
    public ImageView generalPericardiumAmountLabel;
    public TextField generalPericardiumAmountInput;
    public Tab parametersMitralTab;
    public RadioButton mitralTypeNativeInput;
    public RadioButton mitralTypeBiologicalInput;
    public RadioButton mitralTypeArtificialInput;
    public ImageView mitralLeafletsLabel;
    public ComboBox mitralLeafletsInput;
    public ImageView mitralRegurgiationLabel;
    public ComboBox mitralRegurgiationInput;
    public ImageView mitralGradientLabel;
    public TextField mitralGradientInput;

    @FXML
    public void initialize() {

        LatexRenderer lr = new LatexRenderer();

        String latex = "{ABC}_{DEF}^{XYZ}";

        //this.aaaa.setImage(lr.latexToImage(latex, 15));
    }


}
