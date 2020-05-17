package com.hanshunping.datastructures.sort.self;

import java.util.Arrays;

/**
 * Created by jgsoft on 2020/5/17.
 */
public class QuickSortTest {

    public static void main(String[] args) {

        int[] arr = {-9, 78, 0, 23, -567, 70, -2, -3, -1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        int l = left;//左下标
        int r = right;//右下标
        int pivot = arr[(l + r) / 2];//pivot 中轴的值

        //临时变量，作为交换时使用
        int temp;

        //while循环的目的是让比pivot值小的 放到左边
        //比pivot值大的 放到右边
        while (l < r) {

            //在pivot的左边一直找，找到一个大于pivot的值，才退出
            while (arr[l] < pivot) {
                l = l + 1;
            }

            //在pivot的右边一直找，找到一个小于pivot的值，才退出
            while (arr[r] > pivot) {
                r = r - 1;
            }

            //如果l >= r 说明pivot的左右两边的值，已经按照左边全部是小于等于pivot的值，
            //右边全部是大于等于pivot的值
            if (l >= r) {
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] == pivot的值相等，则 r--, 前移
            if (arr[l] == pivot) {
                r = r - 1;
            }

            //如果交换完后，发现这个arr[r] == pivot的值相等，则 l++, 后移
            if (arr[r] == pivot) {
                l = l + 1;
            }

        }
        //如果 l == r, 必须l++,r--,否则为出现栈溢出
        if (l == r) {
            l = l + 1;
            r = r -1;
        }
        //向左递归
        if (left < r) {
            quickSort(arr, left, r);
        }
        //向右递归
        if (right > l) {
            quickSort(arr, l, right);
        }
    }
}
