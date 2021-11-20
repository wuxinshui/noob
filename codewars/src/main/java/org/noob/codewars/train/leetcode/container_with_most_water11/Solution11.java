package org.noob.codewars.train.leetcode.container_with_most_water11;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * 示例 2：
 * <p>
 * 输入：height = [1,1]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：height = [4,3,2,1,4]
 * 输出：16
 * 示例 4：
 * <p>
 * 输入：height = [1,2,1]
 * 输出：2
 *  
 * <p>
 * 提示：
 * <p>
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution11 {

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.maxArea_read_official(array));
    }

    /**
     * 执行用时：
     * 4 ms
     * , 在所有 Java 提交中击败了
     * 67.62%
     * 的用户
     * 内存消耗：
     * 51.9 MB
     * , 在所有 Java 提交中击败了
     * 42.27%
     * 的用户
     * 通过测试用例：
     * 60 / 60
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * 参考官方
     * read official for reference
     * <p>
     * 水的面积=最小值*距离
     * <p>
     * 双指针：左指针，右指针
     * 时间复杂度：O（N）
     * 空间复杂度：O（1）
     *
     * @param height
     * @return
     */
    public int maxArea_read_official(int[] height) {
        int area = 0;
        int right = height.length - 1;
        int left = 0;
        while (left < right) {
            int ans = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(ans, area);
            if (height[left] <= height[right]) {
                ++left;
            } else {
                --right;
            }
        }


        return area;
    }


    /**
     * 复杂度分析
     * <p>
     * 时间复杂度：O(N)O(N)，双指针总计最多遍历整个数组一次。
     * <p>
     * 空间复杂度：O(1)O(1)，只需要额外的常数级别的空间。
     * <p>
     * <p>
     * 方法一：双指针
     * 说明
     * <p>
     * 本题是一道经典的面试题，最优的做法是使用「双指针」。如果读者第一次看到这题，不一定能想出双指针的做法。
     * <p>
     * 分析
     * <p>
     * 我们先从题目中的示例开始，一步一步地解释双指针算法的过程。稍后再给出算法正确性的证明。
     * <p>
     * 题目中的示例为：
     * <p>
     * <p>
     * [1, 8, 6, 2, 5, 4, 8, 3, 7]
     * ^                       ^
     * 在初始时，左右指针分别指向数组的左右两端，它们可以容纳的水量为 \min(1, 7) * 8 = 8min(1,7)∗8=8。
     * <p>
     * 此时我们需要移动一个指针。移动哪一个呢？直觉告诉我们，应该移动对应数字较小的那个指针（即此时的左指针）。这是因为，由于容纳的水量是由
     * <p>
     * 两个指针指向的数字中较小值 * 指针之间的距离
     * 两个指针指向的数字中较小值∗指针之间的距离
     * <p>
     * 决定的。如果我们移动数字较大的那个指针，那么前者「两个指针指向的数字中较小值」不会增加，后者「指针之间的距离」会减小，那么这个乘积会减小。因此，我们移动数字较大的那个指针是不合理的。因此，我们移动 数字较小的那个指针。
     * <p>
     * 有读者可能会产生疑问：我们可不可以同时移动两个指针？ 先别急，我们先假设 总是移动数字较小的那个指针 的思路是正确的，在走完流程之后，我们再去进行证明。
     * <p>
     * 所以，我们将左指针向右移动：
     * <p>
     * <p>
     * [1, 8, 6, 2, 5, 4, 8, 3, 7]
     * ^                    ^
     * 此时可以容纳的水量为 \min(8, 7) * 7 = 49min(8,7)∗7=49。由于右指针对应的数字较小，我们移动右指针：
     * <p>
     * <p>
     * [1, 8, 6, 2, 5, 4, 8, 3, 7]
     * ^                 ^
     * 此时可以容纳的水量为 \min(8, 3) * 6 = 18min(8,3)∗6=18。由于右指针对应的数字较小，我们移动右指针：
     * <p>
     * <p>
     * [1, 8, 6, 2, 5, 4, 8, 3, 7]
     * ^              ^
     * 此时可以容纳的水量为 \min(8, 8) * 5 = 40min(8,8)∗5=40。两指针对应的数字相同，我们可以任意移动一个，例如左指针：
     * <p>
     * <p>
     * [1, 8, 6, 2, 5, 4, 8, 3, 7]
     * ^           ^
     * 此时可以容纳的水量为 \min(6, 8) * 4 = 24min(6,8)∗4=24。由于左指针对应的数字较小，我们移动左指针，并且可以发现，在这之后左指针对应的数字总是较小，因此我们会一直移动左指针，直到两个指针重合。在这期间，对应的可以容纳的水量为：\min(2, 8) * 3 = 6min(2,8)∗3=6，\min(5, 8) * 2 = 10min(5,8)∗2=10，\min(4, 8) * 1 = 4min(4,8)∗1=4。
     * <p>
     * 在我们移动指针的过程中，计算到的最多可以容纳的数量为 4949，即为最终的答案。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/container-with-most-water/solution/sheng-zui-duo-shui-de-rong-qi-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public class Solution_OFFICIAL {
        public int maxArea(int[] height) {
            int l = 0, r = height.length - 1;
            int ans = 0;
            while (l < r) {
                int area = Math.min(height[l], height[r]) * (r - l);
                ans = Math.max(ans, area);
                if (height[l] <= height[r]) {
                    ++l;
                } else {
                    --r;
                }
            }
            return ans;
        }
    }
}
