package gui.custom.input.composite;

import javafx.beans.DefaultProperty;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CollapsibleInput extends VBox {

    @FXML
    private VBox mainInputArea;
    @FXML
    private VBox secondaryInputArea;
    @FXML
    private ImageView toggleSecondary;

    private boolean isShown = false;
    private Image showImage;
    private Image hideImage;

    public CollapsibleInput() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/custom/input/composite/CollapsibleInput.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        }
        catch(IOException exception) {
            throw new RuntimeException(exception);
        }
        loadImages();
        setupToggleHandler();
        this.secondaryInputArea.setVisible(false);
        this.toggleSecondary.setImage(this.showImage);
    }

    private void setupToggleHandler() {
        this.toggleSecondary.setOnMouseReleased(event -> {
            this.isShown = !this.isShown;
            this.secondaryInputArea.setVisible(this.isShown);
            this.secondaryInputArea.setDisable(this.isShown);
            if(this.isShown) {
                this.toggleSecondary.setImage(this.hideImage);
            }
            else {
                this.toggleSecondary.setImage(this.showImage);
            }
        });
    }

    private void loadImages() {
        try {
            BufferedImage img = ImageIO.read(getClass().getResource("/gui/graphics/show_arrow.png"));
            this.showImage = SwingFXUtils.toFXImage(img, null);
        }
        catch(IOException e) {
            System.out.println("dupa111");
        }
        try {
            BufferedImage img = ImageIO.read(getClass().getResource("/gui/graphics/hide_arrow.png"));
            this.hideImage = SwingFXUtils.toFXImage(img, null);
        }
        catch(IOException e) {
            System.out.println("dupa222");
        }
    }

    public void setMainInputs(Node... nodes) {
        this.mainInputArea.getChildren().addAll(nodes);
    }

    public ObservableList<Node> getMainInputs() {
        return this.mainInputArea.getChildren();
    }

    public void setSecondaryInputs(Node... nodes) {
        this.secondaryInputArea.getChildren().addAll(nodes);
    }

    public ObservableList<Node> getSecondaryInputs() {
        return this.secondaryInputArea.getChildren();
    }

}
