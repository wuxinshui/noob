package org.noob.codewars.train.leetcode.valid_parentheses20;

import java.util.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 * <p>
 * 输入：s = "{[]}"
 * 输出：true
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution20 {

    private static Set<Character> left = new HashSet<>();
    private static Set<Character> right = new HashSet<>();
    private static Set<String> all = new HashSet<>();

    static {
        left.add('(');
        left.add('{');
        left.add('[');
        right.add(')');
        right.add('}');
        right.add(']');
        all.add("()");
        all.add("{}");
        all.add("[]");
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        // String s = "(([]){})";
        // String s = "){";
        // String s = "(])";
        String s = "()";
        System.out.println(solution20.isValid_my_first(s));
        System.out.println(solution20.isValid_stack(s));
    }

    /**
     * 方法一：栈
     * 判断括号的有效性可以使用「栈」这一数据结构来解决。
     * <p>
     * 我们遍历给定的字符串 ss。当我们遇到一个左括号时，我们会期望在后续的遍历中，有一个相同类型的右括号将其闭合。由于后遇到的左括号要先闭合，因此我们可以将这个左括号放入栈顶。
     * <p>
     * 当我们遇到一个右括号时，我们需要将一个相同类型的左括号闭合。此时，我们可以取出栈顶的左括号并判断它们是否是相同类型的括号。如果不是相同的类型，或者栈中并没有左括号，那么字符串 ss 无效，返回 \text{False}False。为了快速判断括号的类型，我们可以使用哈希表存储每一种括号。哈希表的键为右括号，值为相同类型的左括号。
     * <p>
     * 在遍历结束后，如果栈中没有左括号，说明我们将字符串 ss 中的所有左括号闭合，返回 \text{True}True，否则返回 \text{False}False。
     * <p>
     * 注意到有效字符串的长度一定为偶数，因此如果字符串的长度为奇数，我们可以直接返回 \text{False}False，省去后续的遍历判断过程。
     * <p>
     * <p>
     * 时间复杂度：O(n)O(n)，其中 nn 是字符串 ss 的长度。
     * <p>
     * 空间复杂度：O(n + |\Sigma|)O(n+∣Σ∣)，其中 \SigmaΣ 表示字符集，本题中字符串只包含 66 种括号，|\Sigma| = 6∣Σ∣=6。栈中的字符数量为 O(n)O(n)，而哈希表使用的空间为 O(|\Sigma|)O(∣Σ∣)，相加即可得到总空间复杂度。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/valid-parentheses/solution/you-xiao-de-gua-hao-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public boolean isValid_official(String s) {
        int len = s.length();

        if (len % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList();

        Map<Character, Character> pairs = new HashMap<>() {{
            put(')', '(');

            put('}', '{');

            put(']', '[');
        }};


        for (
                int i = 0;
                i < len; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }

        }

        return stack.isEmpty();
    }

    /**
     * 执行结果：
     * 通过
     * 显示详情
     * 添加备注
     * <p>
     * 执行用时：
     * 8 ms
     * , 在所有 Java 提交中击败了
     * 7.92%
     * 的用户
     * 内存消耗：
     * 38.4 MB
     * , 在所有 Java 提交中击败了
     * 7.69%
     * 的用户
     * 通过测试用例：
     * 91 / 91
     * <p>
     * 整理思路
     * 1。区分左右
     * 2。左入栈，遇右出栈
     * 3。细节：左右不匹配，马上失败，其他就不比较了。
     * 4。stak.pop(),stack.peek()方法异同
     * 5。char 拼接字符串
     *
     * @param s
     * @return
     */
    public boolean isValid_stack(String s) {

        if (null == s || s.length() < 2) {
            return false;
        }

        Set<Character> left = Set.of('(', '[', '{');
        Set<Character> right = Set.of(')', ']', '}');

        Set<String> alls = Set.of("()", "{}", "[]");
        Stack<Character> stack = new Stack();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (left.contains(ch)) {
                stack.push(ch);
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            if (right.contains(ch)) {

                Character st = stack.peek();
                String str = String.valueOf(st) + ch;
                if (alls.contains(str)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.empty();

    }

    /**
     * "(([]){})"
     * <p>
     * 输出：
     * false
     * 预期结果：
     * true
     *
     * @param s
     * @return
     */
    public boolean isValid_my_first(String s) {

        if (null == s || s.length() == 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
        }

        return s.length() == 0;

    }
}
