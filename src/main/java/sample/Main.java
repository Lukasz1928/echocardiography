package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("gui.text.guiLabels", new Locale("pl", "PL"));
        Parent root = FXMLLoader.load(getClass().getResource("/gui/templates/mainWindow.fxml"), bundle);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
