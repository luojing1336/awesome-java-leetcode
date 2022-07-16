package com.blankj.easy._009;
/**
 * @author luojing
 * @description LJSolution
 * @date 2022/07/16
 */

public class LJSolution {
    public boolean isPalindrome1(int x) {
        // 计算全部长度
        if (x < 0) return false; // 负数直接false
        int copyX = x, reverse = 0;
        while (copyX > 0) {
            // 将x逆序输出
            reverse = reverse * 10 + copyX % 10;
            copyX /= 10;
        }
        return x == reverse; // 判断x与逆序输出的reverse值是否相等
    }

    public boolean isPalindrome2(int x) {
        //计算一半长度
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int halfReverseX = 0;
        while (x > halfReverseX) { // x再除10，halfReverseX再不断乘1-，结束的标志就是x 不再> halfReverseX
            // 将x逆序输出
            halfReverseX = halfReverseX * 10 + x % 10;
            x /= 10;
        }
        return halfReverseX == x || halfReverseX / 10 ==x; //！！！10的倍数10010，也会返回true
    }

    public static void main(String[] args) {
        LJSolution ljSolution = new LJSolution();
        System.out.println(ljSolution.isPalindrome1(-1));
        System.out.println(ljSolution.isPalindrome1(10010));
        System.out.println(ljSolution.isPalindrome1(0));
        System.out.println(ljSolution.isPalindrome1(11));
        System.out.println(ljSolution.isPalindrome2(111));
        System.out.println(ljSolution.isPalindrome2(1234321));
        System.out.println(ljSolution.isPalindrome2(222222222));
    }
}
