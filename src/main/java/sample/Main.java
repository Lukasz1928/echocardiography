package sample;

import gui.utils.LatexRenderer;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        ResourceBundle bundle = ResourceBundle.getBundle("gui.text.guiLabels", new Locale("pl", "PL"));
//        Parent root = FXMLLoader.load(getClass().getResource("/gui/templates/mainWindow.fxml"), bundle);
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
//    }

    public static void main(String[] args) {

        LatexRenderer lr = new LatexRenderer();

        File outputfile = new File("aaa_bbb_ccc.png");
        BufferedImage image = SwingFXUtils.fromFXImage(lr.latexToImage("{aaa}^{bbb}^{bbb}^{ddd}^{ggg}", 15), null);
        try {
            ImageIO.write(image, "png", outputfile);
        }
        catch(Exception e) {
            //
        }
        //launch(args);
    }
}
