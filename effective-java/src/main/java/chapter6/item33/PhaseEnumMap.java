package chapter6.item33;

import java.util.EnumMap;
import java.util.Map;

/**
 * <p>PhaseEnumMap</p>
 * 最好不要用序数来索引数组，而要使用EnumMap
 * @author wuxinshui
 */
//Using a nested EnumMap to associate data with enum pairs
public enum PhaseEnumMap {
    //固体、液体、气体
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID);

        private final PhaseEnumMap src;
        private final PhaseEnumMap dst;

        Transition(PhaseEnumMap src, PhaseEnumMap dst) {
            this.src = src;
            this.dst = dst;
        }

        //Initialize the phase transition map
        private static final Map<PhaseEnumMap, Map<PhaseEnumMap, Transition>> m = new EnumMap<>(PhaseEnumMap.class);

        static {
            for (PhaseEnumMap p : PhaseEnumMap.values()) {
                m.put(p, new EnumMap<>(PhaseEnumMap.class));
            }

            for (Transition trans : Transition.values()) {
                m.get(trans.src).put(trans.dst, trans);
            }
        }

        public static Transition from(PhaseEnumMap src, PhaseEnumMap dst) {
            return m.get(src).get(dst);
        }


    }
}
