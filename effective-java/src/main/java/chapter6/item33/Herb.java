package chapter6.item33;

/**
 * <p>Herb</p>
 * 用EnumMap代替序数索引
 *
 * @author wuxinshui
 */
//表示烹饪用的一种香草
//香草类型：  ANNUL-一年生, PERENNIAL-多年生, BIENNIAL-两年生
public class Herb {
    public enum Type {
        ANNUL, PERENNIAL, BIENNIAL
    }

    private String name;
    private Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
