package com.lianxi3.one;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 两数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 */
public class TestMain {

    @Test
    public void test() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;

        int[] ints = twoSumHash2(nums, target);

        System.out.println(ints);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;

    }

    public int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    /**
     * int[] nums = {-1, -2, -3, -4, -5};
     * int target = -8;
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumHash2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int leaveInt = target - nums[i];

            if (map.containsKey(leaveInt)) {
                return new int[]{map.get(leaveInt), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

























}
