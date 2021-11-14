package org.noob.codewars.train.leetcode.twosum1;

import java.util.*;

/**
 * @Author: yoyo
 * @Description: https://leetcode-cn.com/problems/two-sum/
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: Created in 2019/10/16 18:49
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        // System.out.println(Arrays.toString(twoSum9(nums, target)));
        System.out.println(Arrays.toString(twoSumHash(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum9(int[] nums, int target) {
        //Arrays.asList(nums).stream().filter(o->o<target).collect(Collectors.toList());
        //Stream.of(nums).filter(o -> o < target).collect(Collectors.toList());
        List<Integer> linked=new LinkedList<>();
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > target) {
                    break;
                }
                if (nums[i] + nums[j] == target) {
                    temp[i]=i;
                    temp[j]=j;
                    linked.add(i);
                    linked.add(j);
                }
            }
        }
        System.out.println(linked);
        return temp;
    }

    /**
     * PASS TEST
     * <p>
     * 执行结果：
     * 通过
     * 显示详情
     * 添加备注
     * <p>
     * 执行用时：
     * 55 ms
     * , 在所有 Java 提交中击败了
     * 25.55%
     * 的用户
     * 内存消耗：
     * 38.6 MB
     * , 在所有 Java 提交中击败了
     * 50.11%
     * 的用户
     * 通过测试用例：
     * 57 / 57
     *
     * 时间复杂度：O(N*N)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * BEST
     * 时间复杂度：O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }


}
