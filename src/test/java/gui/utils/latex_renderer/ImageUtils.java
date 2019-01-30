package gui.utils.latex_renderer;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;
import org.junit.Assert;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ImageUtils {
    public static BufferedImage readImage(String path) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(path);
        return ImageIO.read(is);
    }

    public static void assertImagesEqual(BufferedImage img1, BufferedImage img2) {
        byte[] bimg1 = image2bytes(img1);
        byte[] bimg2 = image2bytes(img2);
        Assert.assertTrue(Arrays.equals(bimg1, bimg2));
    }

    public static byte[] image2bytes(BufferedImage img) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytesImg = new byte[0];
        try {
            ImageIO.write(img, "png", baos);
            baos.flush();
            bytesImg = baos.toByteArray();
            baos.close();
        }
        catch(IOException e) {
            return bytesImg;
        }
        return bytesImg;
    }

    public static BufferedImage writableImage2BufferedImage(WritableImage img) {
        return SwingFXUtils.fromFXImage(img, null);
    }
}
