package com.hanshunping.datastructures.hashtab.self;

/**
 * Created by jgsoft on 2020/5/17.
 */
public class HashTabDemo {

    public static void main(String[] args) {

        //创建哈希表
        HashTab hashTab = new HashTab(7);

        //创建 雇员
        Emp emp1 = new Emp(1, "haha");
        hashTab.add(emp1);

        Emp emp2 = new Emp(2, "haha");
        hashTab.add(emp2);

        Emp emp7 = new Emp(7, "haha");
        hashTab.add(emp7);

        Emp emp8 = new Emp(8, "haha");
        hashTab.add(emp8);


        hashTab.findEmpById(7);
    }

}
