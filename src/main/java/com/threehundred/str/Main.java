package com.threehundred.str;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 字符串翻转
 *
 * 字母异位词
 * @author james
 * @date 2020/6/22
 */
public class Main {

    public static void main(String[] args) {
        boolean b = test3();
        System.out.println(b);
    }

    public static void test() {
        String str = "algorithm#";
        char[] chars = str.toCharArray();

        List<String> list = Lists.newArrayList();
        for (char c : chars) {
            list.add(String.valueOf(c));
        }

        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i));
        }
    }

    public static void test2() {
        String str = "abc";
        char[] chars = str.toCharArray();

        char[] copy = new char[chars.length];

        int beginIndex = -1;
        int endIndex = chars.length;

        while (true) {
            beginIndex = beginIndex + 1;
            endIndex = endIndex - 1;

            transfer(copy, chars, beginIndex, endIndex);

            if ((beginIndex - endIndex) == 0 || Math.abs(beginIndex - endIndex) == 1) {
                System.out.println(copy);
                break;
            }
        }



    }

    private static void transfer(char[] copy, char[] chars, int beginIndex, int endIndex) {

        copy[beginIndex] = chars[endIndex];
        copy[endIndex] = chars[beginIndex];

    }


    public static boolean test3() {
        String s = "anagram";
        String t = "nagaram";

        char[] sChars = s.toCharArray();

        Map<String, Integer> sCharMap = Maps.newHashMap();
        for (char sChar : sChars) {
            String sStr = String.valueOf(sChar);
            if (sCharMap.get(sStr) == null) {
                sCharMap.put(sStr, 1);
            } else {
                Integer val = sCharMap.get(sStr);
                sCharMap.put(sStr, val+1);
            }
        }

        char[] tChars = t.toCharArray();

        Map<String, Integer> tCharMap = Maps.newHashMap();
        for (char tChar : tChars) {
            String tStr = String.valueOf(tChar);
            if (tCharMap.get(tStr) == null) {
                tCharMap.put(tStr, 1);
            } else {
                Integer val = tCharMap.get(tStr);
                tCharMap.put(tStr, val+1);
            }
        }

        for (Map.Entry<String, Integer> entry : sCharMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            Integer tVal = tCharMap.get(key);
            if (tVal == null) {
                return false;
            }

            if (value.intValue() != tVal) {
                return false;
            }
        }

        return true;

    }

}

