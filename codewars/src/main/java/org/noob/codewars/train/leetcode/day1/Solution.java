package org.noob.codewars.train.leetcode.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println(Arrays.toString(twoSum9(nums, target)));
    }

    public static int[] twoSum9(int[] nums, int target) {
        //Arrays.asList(nums).stream().filter(o->o<target).collect(Collectors.toList());
        //Stream.of(nums).filter(o -> o < target).collect(Collectors.toList());
        int[] temp = new int[nums.length];
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            for (int j = 0; j < nums.length; i++) {
                if (nums[i] > target) {
                    break;
                }
                if (nums[i] + nums[j] == target) {
                    temp[k]=i;
                    k++;
                    temp[k]=j;
                    k++;
                }
            }
        }
        return temp;
    }
}
