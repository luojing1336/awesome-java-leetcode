package com.blankj.easy._16_11;

public class LJSolution {

    /**
     * 此题可以简化为一道等差数列的问题
     * 找规律，k*s, (k-1)*s+l, (k-2)*s+2*l, (k-3)*s+3*l, (k-4)*s+4*l, ... , kl
     * 首项: ks, 公差: l-s, 返回从小到大的等差数列项的数列
     */
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[0];
        if (shorter == longer) return new int[] { shorter * k};
        int[] ans = new int[ k + 1];
        int st = k * shorter;
        int delta = longer - shorter;
        for (int i = 0; i <= k ; i++) {
            ans[i] = st + i * delta;
        }
        return ans;
    }

    public static void main(String[] args) {
        LJSolution ljSolution = new LJSolution();
        System.out.println(Arrays.toString(ljSolution.divingBoard(1,2,3)));
    }
}