package chapter6.item33;

/**
 * <p>PhaseOrdinalIndexed</p>
 * 最好不要用序数来索引数组，而要使用EnumMap
 *
 * @author wuxinshui
 *         <p>
 *         PhaseOrdinalIndexed - 阶段
 *         <p>
 *         使用一个数组将两个阶段映射到一个阶段过渡中（从液体到固体称作凝固，从液体到气体称作沸腾）
 */
public enum PhaseOrdinalIndexed {
    //固体、液体、气体
    SOLID, LIQUID, GAS;

    public enum Transition {
        //熔化，结冻，沸腾，凝结，升华，沉淀
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        //    Rows indexed by src-ordinal,cols by dst-ordinal
        private static final Transition[][] TRANSITIONS = {
                {null, MELT, SUBLIME}, {FREEZE, null, BOIL}, {DEPOSIT, CONDENSE, null}
        };

        //    Returns the phase transition from one phase to another
        public static Transition from(PhaseOrdinalIndexed src, PhaseOrdinalIndexed dst) {
            return TRANSITIONS[src.ordinal()][dst.ordinal()];
        }
    }
}
