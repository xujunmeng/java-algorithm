package com.hanshunping.datastructures.hashtab.self2;

/**
 * Created by jgsoft on 2020/5/23.
 */
public class HashTabDemo {

    public static void main(String[] args) {
        HashTab hashTab = new HashTab(5);

        Emp emp1 = new Emp(1, "wawa");
        hashTab.add(emp1);

        Emp emp2 = new Emp(6, "haha");
        hashTab.add(emp2);

    }

}
