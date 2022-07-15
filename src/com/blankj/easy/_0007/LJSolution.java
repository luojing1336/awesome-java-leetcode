package com.blankj.easy._007;

/**
 * @author luojing
 * @description LJSolution
 * @date 2022/07/15
 */

public class LJSolution {
    public int reverse(int x) {
        long res = 0;
        for (; x != 0 ; x /= 10) {
            /**
             * 0. 除10一循环，直到除不了10后
             * 1. 先获取x的余数，也就是最后一位，依次类推获取新的最后一位
             * 2. 获取最后一位数后再按次数乘以10，就将整形数反转了
             * 3. 溢出返回0，返回时判断下是否会溢出
             * 4. 注意0*10还是0，不存在反转后001这种数
             */
            res = res * 10 + x%10;
        }
        return res > Integer.MAX_VALUE || res<Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        LJSolution ljSolution = new LJSolution();
        System.out.println(ljSolution.reverse(123));
        System.out.println(ljSolution.reverse(-123)); //负数
        System.out.println(ljSolution.reverse(100)); //末尾有0
        System.out.println(ljSolution.reverse(1000000003)); //溢出
    }
}
