package chapter6.item32;

/**
 * <p>BitFieldText</p>
 *
 * @author wuxinshui
 */
//Big field enumeration constants -OBSOLETE
public class BitFieldText {
    public static final int STYLE_BOLD = 1 << 0;//1
    public static final int STYLE_ITALIC = 1 << 1;//2
    public static final int STYLE_UNDERLINE = 1 << 2;//4
    public static final int STYLE_STRIKETHROUGH = 1 << 3;//8

    //Parameter is bitwise OR of zero or more STYLE_CONSTANTS
    public void applyStyles(int styles) {
        System.out.println("BitFieldText");
        System.out.println(styles);
    }
}
