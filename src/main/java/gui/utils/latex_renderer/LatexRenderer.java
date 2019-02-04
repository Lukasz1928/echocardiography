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
        if(latex.matches("([^{}_^]*\\s?)*")) {
            formattedLatexBuilder.append(String.format("\\text{%s}", latex));
        }
        else {
            String splitRegex = "((?=([_^]\\{))|((?<=(\\})(?=(\\{)))))";
            List<String> tokens = new ArrayList<>(Arrays.asList(latex.split(splitRegex)));
            List<TextGroup> groups;
            try {
                groups = this.calculateTextGroups(tokens);
            }
            catch(StringIndexOutOfBoundsException e) {
                throw new FormatException();
            }
            for(TextGroup group : groups) {
                formattedLatexBuilder.append(group);
            }
        }
        String formattedLatex = formattedLatexBuilder.toString();
        TeXFormula formula = new TeXFormula(formattedLatex);
        TeXIcon icon = formula.new TeXIconBuilder().setStyle(TeXConstants.STYLE_TEXT).setSize(size).build();
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        return SwingFXUtils.toFXImage(image, null);
    }

    public WritableImage latexToImage(String latex) throws FormatException {
        return this.latexToImage(latex, 15);
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
        try {
            for(String token : tokens) {
                if(token.matches("\\{[^{}_^]*\\}")) {
                    groups.add(new TextGroup());
                    groups.get(groups.size() - 1).base += token.substring(token.indexOf('{') + 1, token.lastIndexOf('}'));
                }
                else if(token.matches("\\^\\{[^{}_^]*\\}")) {
                    groups.get(groups.size() - 1).superscript += token.substring(token.indexOf('{') + 1, token.lastIndexOf('}'));
                }
                else if(token.matches("_\\{[^{}_^]*\\}")) {
                    groups.get(groups.size() - 1).subscript += token.substring(token.indexOf('{') + 1, token.lastIndexOf('}'));
                }
                else {
                    throw new FormatException();
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            throw new FormatException();
        }
        return groups;
    }
}
