package gui.controllers;

import gui.utils.LatexRenderer;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView aaaa;

    //@FXML
    //private Pane abcd;

    @FXML
    public void initialize() {

        LatexRenderer lr = new LatexRenderer();

        String latex = "{ABC}_{DEF}^{XYZ}";

        this.aaaa.setImage(lr.latexToImage(latex, 15));
    }


}
