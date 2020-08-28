package com.lianxi2.search;

import org.junit.Test;

/**
 * @author james
 * @date 2020/8/27
 */
public class TestMain {

    @Test
    public void test1() {
        int arr[] = {1, 8, 10, 89, 1000, 1010, 1234};

        int i = binarySearch2(arr, 0, arr.length - 1, 1000);

        System.out.println(i);



    }

    public int binarySearch2(int[] arr, int left, int right, int findVal) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (findVal > arr[mid]) {
            // 向右递归
            return binarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < arr[mid]) {
            // 向左递归
            return binarySearch2(arr, left, mid -1, findVal);
        } else {
            return mid;
        }

    }




    // 二分查找算法
    /**
     *
     * @param arr
     *            数组
     * @param left
     *            左边的索引
     * @param right
     *            右边的索引
     * @param findVal
     *            要查找的值
     * @return 如果找到就返回下标，如果没有找到，就返回 -1
     */
    public static int binarySearch(int[] arr, int left, int right, int findVal) {


        // 当 left > right 时，说明递归整个数组，但是没有找到
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            // 向 右递归
            return binarySearch(arr, mid + 1, right, findVal);

        } else if (findVal < midVal) {
            // 向左递归
            return binarySearch(arr, left, mid - 1, findVal);

        } else {
            return mid;
        }

    }


}
