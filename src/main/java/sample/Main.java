package sample;

import gui.utils.latex_renderer.FormatException;
import gui.utils.latex_renderer.LatexRenderer;
import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

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
        try {
            LatexRenderer lr = new LatexRenderer();

            File outputfile = new File("aaa_bbb_ccc.png");
            BufferedImage image = SwingFXUtils.fromFXImage(lr.latexToImage("{aaa}_{bbb}_{bbb}"), null);
            try {
                ImageIO.write(image, "png", outputfile);
            } catch(Exception e) {
                System.out.println("dupa1");
            }
        }
        catch(FormatException e) {
            System.out.println(e.getMessage());
        }
        //launch(args);
    }
}
