package gui.utils;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LatexRenderer {
    public WritableImage latexToImage(String latex, int size) {
        String splitRegex = "(?=([_^]))";
        List<String> tokens = new ArrayList<>(Arrays.asList(latex.split(splitRegex)));
        StringBuilder formattedLatexBuilder = new StringBuilder();
        for(String token : tokens) {
            if(token.startsWith("_") || token.startsWith("^")) {
                String formattedToken = String.format("%s{\\text%s}", token.substring(0, 1), token.substring(1));
                formattedLatexBuilder.append(formattedToken);
            }
            else {
                String formattedToken = String.format("{\\text%s}", token);
                formattedLatexBuilder.append(formattedToken);
            }
        }
        String formattedLatex = formattedLatexBuilder.toString();

        System.out.println(formattedLatex);

        TeXFormula formula = new TeXFormula(formattedLatex);
        TeXIcon icon = formula.new TeXIconBuilder().setStyle(TeXConstants.STYLE_TEXT).setSize(size).build();
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        return SwingFXUtils.toFXImage(image, null);
    }

    public WritableImage latexToImage(String latex) {
        return this.latexToImage(latex, 15);
    }
}
