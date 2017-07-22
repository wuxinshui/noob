package chapter6.item31;

/**
 * <p>Ensemble2</p>
 *
 * @author wuxinshui
 *         永远不要根据枚举的序数导出与它关联的值，而是要将他保存在一个实例域中。
 *         <p>
 *         用实例域代替序数
 */
public enum Ensemble2 {
    // SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6), SEPTET(7), OCTET(8), NONET(9), DECTET(10), TRIPLE_QUARTET(12);
    //sort order
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6), SEPTET(7), OCTET(8), DECTET(10), NONET(9), TRIPLE_QUARTET(12);

    private int numberOfMusicians;

    Ensemble2(int size) {
        this.numberOfMusicians = size;
    }

    public int getNumberOfMusicians() {
        return numberOfMusicians;
    }
}
