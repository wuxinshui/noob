package org.noob.codewars.train.leetcode.longest_substring_without_repeating_characters3;


import java.util.*;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    /**
     * 执行结果：
     * 解答错误
     * 显示详情
     * 添加备注
     * <p>
     * 通过测试用例：
     * 340 / 987
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring_MINE(String s) {
        if (null == s || s.isEmpty()) {
            return 0;
        }
        int count = 0;
        int length = s.length();
        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                if (set.size() > count) {
                    count = set.size();
                    System.out.println(set);
                }
                set.clear();
                set.add(c);
            } else {
                set.add(c);
            }
        }


        return count;
    }

    /**
     * 官方
     * <p>
     * <p>
     * 复杂度分析
     * <p>
     * 时间复杂度：O(N)O(N)，其中 NN 是字符串的长度。左指针和右指针分别会遍历整个字符串一次。
     * <p>
     * 空间复杂度：O(|\Sigma|)O(∣Σ∣)，其中 \SigmaΣ 表示字符集（即字符串中可以出现的字符），|\Sigma|∣Σ∣ 表示字符集的大小。在本题中没有明确说明字符集，因此可以默认为所有 ASCII 码在 [0, 128)[0,128) 内的字符，即 |\Sigma| = 128∣Σ∣=128。我们需要用到哈希集合来存储出现过的字符，而字符最多有 |\Sigma|∣Σ∣ 个，因此空间复杂度为 O(|\Sigma|)O(∣Σ∣)。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetc-2/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring_OFFICIAL(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    /**
     * 执行结果：
     * 通过
     * 显示详情
     * 添加备注
     * <p>
     * 执行用时：
     * 6 ms
     * , 在所有 Java 提交中击败了
     * 72.48%
     * 的用户
     * 内存消耗：
     * 38.1 MB
     * , 在所有 Java 提交中击败了
     * 95.22%
     * 的用户
     * 通过测试用例：
     * 987 / 987
     *
     * @param s
     * @return
     */

    public int lenghtLongestSubstring_EASY_DO(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();

        for (int start = 0, end = 0; end < len; end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch) + 1, start);
            }

            ans = Math.max(ans, (end - start + 1));

            map.put(ch, end);
        }

        return ans;

    }


    public static void main(String[] args) {
        // String s = "abcabcbb";
        String s = "pwwkew";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring_MINE(s));
    }
}
