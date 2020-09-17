package com.lianxi3.eight;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 *  示例:
 *
 *  输入: [-2,1,-3,4,-1,2,1,-5,4]
 *  输出: 6
 *  解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *  进阶:
 *
 *  如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * @author james
 * @date 2020/9/16
 */
public class TestMain {


    public static void main(String[] args) {
        int[] arrs = new int[]{1,2,1};
        maxSubArray(arrs);
    }

    public static int maxSubArray(int[] arrs) {
        //结果
        int result = arrs[0];

        //前一个子组合的最大值，状态压缩
        int preGroupSum = 0;

        for (int arr : arrs) {
            if (preGroupSum > 0) {
                //前一个子组合最大值大于0，正增益
                preGroupSum = preGroupSum + arr;
            } else {
                //前一个子组合最大值小于0，抛弃前面的结果
                preGroupSum = arr;
            }
            //计算全局最大值
            result = Math.max(result, preGroupSum);
        }
        return result;


    }

}


