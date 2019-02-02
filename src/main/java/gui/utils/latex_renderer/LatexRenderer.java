package gui.utils.latex_renderer;

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
    public WritableImage latexToImage(String latex, int size) throws FormatException {
        StringBuilder formattedLatexBuilder = new StringBuilder();
        if(latex.matches("(\\w\\s?)*")) {
            formattedLatexBuilder.append(String.format("\\text{%s}", latex));
        }
        else {
            String splitRegex = "(?=([_^]))";
            List<String> tokens = new ArrayList<>(Arrays.asList(latex.split(splitRegex)));
            List<TextGroup> groups = this.calculateTextGroups(tokens);
            for(TextGroup group : groups) {
                formattedLatexBuilder.append(group);
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

    private class TextGroup {
        public String base = "";
        public String subscript = "";
        public String superscript = "";

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            if(!base.equals("")) {
                builder.append(String.format("{\\text{%s}}", base));
            }
            if(!subscript.equals("")) {
                builder.append(String.format("_{\\text{%s}}", subscript));
            }
            if(!superscript.equals("")) {
                builder.append(String.format("^{\\text{%s}}", superscript));
            }
            return builder.toString();
        }
    }

    private List<TextGroup> calculateTextGroups(List<String> tokens) throws FormatException {
        List<TextGroup> groups = new ArrayList<>();
        System.out.println(tokens);
        try {
            for(String token : tokens) {
                if(token.matches("[a-zA-Z{].*")) {
                    groups.add(new TextGroup());
                    groups.get(groups.size() - 1).base += token.substring(token.indexOf('{') + 1, token.lastIndexOf('}'));
                }
                else if(token.startsWith("^")) {
                    groups.get(groups.size() - 1).superscript += token.substring(token.indexOf('{') + 1, token.lastIndexOf('}'));
                }
                else if(token.startsWith("_")) {
                    groups.get(groups.size() - 1).subscript += token.substring(token.indexOf('{') + 1, token.lastIndexOf('}'));
                }
                else {
                    throw new FormatException(token);
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new FormatException();
        }
        return groups;
    }

    public WritableImage latexToImage(String latex) throws FormatException {
        return this.latexToImage(latex, 15);
    }
}
