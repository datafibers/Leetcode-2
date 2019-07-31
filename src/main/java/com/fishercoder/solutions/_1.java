package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class _1 {

    public static class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                } else {
                    map.put(nums[i], i);
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hm = new HashMap<>();
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                int diff = target - nums[i];
                if (hm.containsKey(diff)) {
                    return new int[]{hm.get(diff), i};
                } else {
                    hm.put(nums[i], i);
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 7, 11, 16};
        int target = 9;
        System.out.println(Arrays.toString(new Solution1().twoSum(array, target)));
        System.out.println(Arrays.toString(new Solution2().twoSum(array, target)));
    }

}
