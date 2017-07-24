package chapter6.item32;

import java.util.Set;

/**
 * <p>BitFieldText</p>
 *
 * @author wuxinshui
 */
public class EnumSetText {

    public enum Style {
        STYLE_BOLD, STYLE_ITALIC, STYLE_UNDERLINE, STYLE_STRIKETHROUGH;
    }

    // Any Set could be passed in ,but EnumSet is clearly best
    public void applyStyles(Set<Style> styles) {
        System.out.println("EnumSetText");
        System.out.println(styles);
    }
}
