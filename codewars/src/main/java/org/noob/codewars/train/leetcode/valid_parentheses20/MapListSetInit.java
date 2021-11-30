package org.noob.codewars.train.leetcode.valid_parentheses20;

import java.util.*;

public class MapListSetInit {
    public static void main(String[] args) {
        Map<Integer, Integer> integerMap = new HashMap<>() {{
            put(1, 2);
            put(2, 2);
            put(3, 2);
        }};

        List<Integer> integerList = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};

        Set<Integer> integerSet = new HashSet<>() {{
            add(2);
            add(3);
        }};
    }
}
