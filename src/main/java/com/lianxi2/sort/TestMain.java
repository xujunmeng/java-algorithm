package com.lianxi2.sort;

import org.junit.Test;

public class TestMain {

    @Test
    public void testQuickSort() {
        int[] arr = {-9, 78, 0, 28, -567, 70};
//        int[] arr = {2, 0, 4, 1, 3};

        quickSort2(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i);
            System.out.println(",");
        }

    }

    public void quickSort2(int[] arr, int left, int right) {
        int l = left;
        int r = right;

        int pivot = arr[(left + right) / 2];

        while (l < r) {

            while (arr[l] < pivot) {
                l = l + 1;
            }

            while (arr[r] > pivot) {
                r = r - 1;
            }

            if( l >= r) {
                break;
            }

            //交换
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;

        }

        if (l == r) {
            l = l + 1;
            r = r - 1;
        }

        //向左递归
        if (left < r) {
            quickSort2(arr, left, r);
        }

        //向右递归
        if (right > l) {
            quickSort2(arr, l, right);
        }


    }
















    /**
     *
     * @param arr
     * @param left 左下标
     * @param right 右下标
     */
    public static void quickSort(int[] arr,int left, int right) {
        int l = left; //左下标
        int r = right; //右下标

        //pivot 中轴值，不是下标
        int pivot = arr[(left + right) / 2];

        int temp = 0; //临时变量，作为交换时使用
        //while循环的目的
        // 比pivot 值小的放到左边，比pivot 值大的放到右边
        while( l < r) {
            //在pivot的左边一直找,找到大于等于pivot值,才退出
            while( arr[l] < pivot) {
                l = l + 1;
            }
            //在pivot的右边一直找,找到小于等于pivot值,才退出
            while(arr[r] > pivot) {
                r = r - 1;
            }
            //如果l >= r说明pivot 的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot值
            if( l >= r) {
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

        }

        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l = l + 1;
            r = r - 1;
        }


        //向左递归
        if(left < r) {
            quickSort(arr, left, r);
        }
        //向右递归
        if(right > l) {
            quickSort(arr, l, right);
        }


    }

}
