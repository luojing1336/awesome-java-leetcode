package com.blankj.easy._020;

/**
 * @author luojing
 * @description LJSolution
 * @date 2022/07/17
 */

public class LJSolution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length() + 1];
        int top = 1; //top从1开始，避免--top的数组越界Exception的发生
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[top++] = c;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            }
        }
        return top == 1;
    }

    public static void main(String[] args) {
        LJSolution ljSolution = new LJSolution();
        System.out.println(ljSolution.isValid("()[]{}({[]})"));
        System.out.println(ljSolution.isValid("(])]"));
    }
}
