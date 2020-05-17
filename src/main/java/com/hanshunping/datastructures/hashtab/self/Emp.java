package com.hanshunping.datastructures.hashtab.self;

/**
 * 表示  雇员
 * Created by jgsoft on 2020/5/17.
 */
public class Emp {

    public int id;
    public String name;
    public Emp next;//next 默认为null

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
