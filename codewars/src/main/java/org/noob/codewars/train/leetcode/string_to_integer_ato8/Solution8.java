package org.noob.codewars.train.leetcode.string_to_integer_ato8;

import java.util.*;

/**
 * 8. 字符串转换整数 (atoi)
 * <p>
 * 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 * <p>
 * 函数 myAtoi(string s) 的算法如下：
 * <p>
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
 * 返回整数作为最终结果。
 * 注意：
 * <p>
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "42"
 * 输出：42
 * 解释：加粗的字符串为已经读入的字符，插入符号是当前读取的字符。
 * 第 1 步："42"（当前没有读入字符，因为没有前导空格）
 * ^
 * 第 2 步："42"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
 * ^
 * 第 3 步："42"（读入 "42"）
 * ^
 * 解析得到整数 42 。
 * 由于 "42" 在范围 [-231, 231 - 1] 内，最终结果为 42 。
 * 示例 2：
 * <p>
 * 输入：s = "   -42"
 * 输出：-42
 * 解释：
 * 第 1 步："   -42"（读入前导空格，但忽视掉）
 * ^
 * 第 2 步："   -42"（读入 '-' 字符，所以结果应该是负数）
 * ^
 * 第 3 步："   -42"（读入 "42"）
 * ^
 * 解析得到整数 -42 。
 * 由于 "-42" 在范围 [-231, 231 - 1] 内，最终结果为 -42 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution8 {

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        // String s = "4193 with words";
        // String s = "-91283472332";
        // String s = "   -42";
        String s = " -42";
        System.out.println(solution8.myAtoi(s));
        // System.out.println(1 << 31);
        // System.out.println(ThreadLocalRandom.current().nextInt(10000, 90000));

        //面试题，引用指针是否会变
        // List<Integer> list1 = new ArrayList<>();
        //
        // list1.add(1);
        // list1.add(2);
        //
        // List<Integer> list2 = list1;
        //
        // list1.add(3);
        //
        // System.out.println(list1);
        // System.out.println(list2);
    }

    public int myAtoi(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        Set<String> set = new TreeSet<>();
        set.addAll((Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")));

        int res = 0;
        int len = s.length();
        int flag = 1;
        for (int i = 0; i < len; i++) {
            if (res > Integer.MAX_VALUE / 10) {
                return Integer.MAX_VALUE;
            }

            if (flag < 0 && flag * res < Integer.MIN_VALUE / 10) {
                return Integer.MIN_VALUE;
            }

            char ch = s.charAt(i);
            if (' ' == ch) {
                continue;
            }

            if ('-' == ch) {
                flag = -1;
                continue;
            }
            if ('+' == ch) {
                flag = 1;
                continue;
            }

            if (!set.contains(String.valueOf(ch))) {
                break;
            }


            res = res * 10 + Integer.valueOf(String.valueOf(ch));
        }


        return res;
    }

    /**
     * 这里我们要进行模式识别，一旦涉及整数的运算，我们需要注意溢出。本题可能产生溢出的步骤在于推入、乘以 1010 操作和累加操作都可能造成溢出。对于溢出的处理方式通常可以转换为 INT_MAX 的逆操作。比如判断某数乘以 1010 是否会溢出，那么就把该数和 INT_MAX 除以 1010 进行比较。
     *
     *
     *
     * <p>
     * 方法一：自动机
     * 思路
     * <p>
     * 字符串处理的题目往往涉及复杂的流程以及条件情况，如果直接上手写程序，一不小心就会写出极其臃肿的代码。
     * <p>
     * 因此，为了有条理地分析每个输入字符的处理方法，我们可以使用自动机这个概念：
     * <p>
     * 我们的程序在每个时刻有一个状态 s，每次从序列中输入一个字符 c，并根据字符 c 转移到下一个状态 s'。这样，我们只需要建立一个覆盖所有情况的从 s 与 c 映射到 s' 的表格即可解决题目中的问题。
     * <p>
     * 算法
     * <p>
     * 本题可以建立如下图所示的自动机：
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi/solution/zi-fu-chuan-zhuan-huan-zheng-shu-atoi-by-leetcode-/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param str
     * @return
     */
    public int myAtoi_OFFICIAL(String str) {
        Automaton automaton = new Automaton();
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            automaton.get(str.charAt(i));
        }
        return (int) (automaton.sign * automaton.ans);
    }

    class Automaton {
        public int sign = 1;
        public long ans = 0;
        private String state = "start";
        private Map<String, String[]> table = new HashMap<String, String[]>() {{
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        public void get(char c) {
            state = table.get(state)[get_col(c)];
            if ("in_number".equals(state)) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
            } else if ("signed".equals(state)) {
                sign = c == '+' ? 1 : -1;
            }
        }

        private int get_col(char c) {
            if (c == ' ') {
                return 0;
            }
            if (c == '+' || c == '-') {
                return 1;
            }
            if (Character.isDigit(c)) {
                return 2;
            }
            return 3;
        }


    }
}
