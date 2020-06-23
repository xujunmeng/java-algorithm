package com.hanshunping.datastructures.sort.self;

/**
 * Created by jgsoft on 2020/5/16.
 */
public class SelectSortTest {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 9, -1, 2, 4, 7, -2, -4};
        sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
        return arr;


//        //第一轮
//        int minIndex = 0;
//        int min = arr[0];
//        for (int j = 1; j <arr.length; j++) {
//            if (min > arr[j]) {
//                min = arr[j];
//                minIndex = j;
//            }
//        }
//        int temp = arr[0];
//        arr[0] = min;
//        arr[minIndex] = temp;
//
//        //第二轮
//
//        int minIndex = 1;
//        int min = arr[1];
//        for (int j = 2; j <arr.length; j++) {
//            if (min > arr[j]) {
//                min = arr[j];
//                minIndex = j;
//            }
//        }
//        int temp = arr[1];
//        arr[1] = min;
//        arr[minIndex] = temp;
    }

}
