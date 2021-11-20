package org.noob.codewars.train.leetcode.reverse_integer;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution7 {

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int x = -123;
        System.out.println(solution7.reverse(x));
        System.out.println(Integer.reverse(x));
    }

    /**
     * @param x
     * @return
     */
    public int reverse(int x) {

        if (0 == x) {
            return 0;
        }

        StringBuilder str = new StringBuilder(String.valueOf(Math.abs(x)));
        Long reverse = Long.valueOf(str.reverse().toString());

        return reverse > Integer.MAX_VALUE ? 0 : x < 0 ? -reverse.intValue() : reverse.intValue();
    }

    /**
     * 123
     * 321
     *
     * @param x
     * @return
     */
    public int reverse_read_official(int x) {
        int ans = 0;


        while (x != 0) {

            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return 0;
            }

            int dig = x % 10;

            ans = ans * 10 + dig;

            x = x / 10;
        }


        return ans;
    }


    /**
     * @param x
     * @return
     */
    public int reverse_OFFICIAL(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;

    }

}
