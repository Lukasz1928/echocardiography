package gui.custom.input.composite;

import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        hideSecondary();
        setupStyle();
    }

    private void setupToggleHandler() {
        this.toggleSecondary.setOnMouseReleased(event -> {
            this.isShown = !this.isShown;
            if(this.isShown) {
                showSecondary();
            }
            else {
                hideSecondary();
            }
        });
    }

    private void showSecondary() {
        this.toggleSecondary.setImage(this.hideImage);
        this.getChildren().add(this.secondaryInputArea);
    }

    private void hideSecondary() {
        this.toggleSecondary.setImage(this.showImage);
        this.getChildren().remove(this.secondaryInputArea);
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

    private void setupStyle() {
        String cssLayout = "-fx-border-color: gray;\n" +
                "-fx-border-width: 1;\n" +
                "-fx-border-style: dashed;\n";
        this.setStyle(cssLayout);
    }

    public void setSecondaryVisible(boolean visible) {
        this.isShown = visible;
        if(visible) {
            this.showSecondary();
        }
        else {
            this.hideSecondary();
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
