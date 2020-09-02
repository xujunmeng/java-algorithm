package com.lianxi2.hashmap;

/**
 * 表示一个雇员
 * @author james
 * @date 2020/9/2
 */
public class Emp {

    public Integer id;
    public String name;
    public Emp next;

    public Emp(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
