package com.lianxi2.hashmap;

/**
 * @author james
 * @date 2020/9/2
 */
public class TestMain {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap(10);

        hashMap.add(new Emp(1, "aa"));
        hashMap.add(new Emp(2, "bb"));
        hashMap.add(new Emp(3, "cc"));
        hashMap.add(new Emp(4, "dd"));

        hashMap.add(new Emp(11, "rr"));
        hashMap.add(new Emp(21, "ii"));
        hashMap.add(new Emp(31, "oo"));

        hashMap.list();

    }

}
