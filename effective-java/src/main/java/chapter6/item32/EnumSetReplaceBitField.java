package chapter6.item32;

import java.util.ArrayList;
import java.util.EnumSet;

/**
 * <p>EnumSetReplaceBitField</p>
 * 用EnumSet替代位域
 *
 * @author wuxinshui
 */
public class EnumSetReplaceBitField {
    public static void main(String[] args) {
        BitFieldText bitFieldText = new BitFieldText();
        bitFieldText.applyStyles(BitFieldText.STYLE_BOLD | BitFieldText.STYLE_ITALIC);

        EnumSetText enumSetText = new EnumSetText();

        System.out.println("Set 集合:");
        //Set 集合
        enumSetText.applyStyles(EnumSet.of(EnumSetText.Style.STYLE_BOLD, EnumSetText.Style.STYLE_ITALIC));

        System.out.println("转换为List集合:");
        //转换为List集合
        System.out.println(new ArrayList<>(EnumSet.of(EnumSetText.Style.STYLE_BOLD, EnumSetText.Style.STYLE_ITALIC)));
    }
}
