package com.hanshunping.datastructures.search.self;

/**
 * Created by jgsoft on 2020/5/17.
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 89, 1000, 1234};
        int resIndex = search(arr, 0, arr.length - 1, 88);
        System.out.println(resIndex);
    }

    public static int search(int[] arr, int left, int right, int findVal) {

        //当left > right 时，说明递归了整个数组，还是没有找到
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {  //向右递归
            return search(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {  //向左递归
            return search(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }

    }

}
