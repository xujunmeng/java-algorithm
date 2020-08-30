package com.lianxi3.four;

import org.junit.Test;

import java.util.Stack;

public class TestMain {

    @Test
    public void test() {
        boolean valid = isValid2("]");
        System.out.println(valid);
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }






















    public boolean isValid(String s) {
        if(s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){

            if(c=='(') {
                stack.push(')');

            } else if(c=='{') {
                stack.push('}');

            } else if(c=='[') {
                stack.push(']');

            }else if(stack.empty() || c != stack.pop()) {
                return false;

            }
        }
        if(stack.empty()) {
            return true;
        }

        return false;
    }


}
