package chapter6.item31;

/**
 * <p>Ensemble1</p>
 *
 * @author wuxinshui
 *         <p>
 *         永远不要根据枚举的序数导出与它关联的值，而是要将他保存在一个实例域中。
 */
public enum Ensemble1 {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;
    //sort order
    // SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, DECTET, NONET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }

    private int size;

    Ensemble1() {
    }

    Ensemble1(int size) {
        this.size = size;
    }
}
