package com.hanshunping.datastructures.sort.self;

/**
 * Created by jgsoft on 2020/5/16.
 */
public class InsertSortTest {

    public static void main(String[] args) {

    }

    public static void sort(int[] arr) {

        //第一轮
        if (arr[1] < arr[0]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }



    }

}
