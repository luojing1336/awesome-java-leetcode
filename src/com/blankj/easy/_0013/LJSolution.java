package com.blankj.easy._013;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luojing
 * @description LJSolution
 * @date 2022/07/17
 */

public class LJSolution {
    /**
     * 罗马数字的逻辑
     * 0. I=1、V=5、X=10、L=50、C=100、D=500、M=1000；
     * 1. 相同数字连写，所表示的数等于这些数字相加得到的数，如III=3；
     * 2. 小的数字在大的数字右边，所表示的数等于这些数字相加得到的数，如VIII=8、XII=12；
     * 3. 小的数字(仅限I=1、X=10和C=100)在大的数字左边，所表示的数等于大数减小数得到的数，如IV=4、IX=9；
     */
    public int romanToInt(String s) {
        // 构建罗马数字和阿拉伯数字的映射关系，并存入映射表
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        // 获取罗马数字字符串的长度
        int len = s.length();
        // 初始化sum，并将最后一个罗马数字值的映射阿拉伯数字赋值给sum
        int sum = map.get(s.charAt(len -1));
        // 从倒数第二个罗马数字开始，到第一个罗马数字结束，遍历，注意--i，先-1再引用
        for (int i = len - 2; i >= 0 ; --i) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                // 如果左边的[s.charAt(i)]小于右边的[s.charAt(i+1)]，sum - 左边的
                sum -= map.get(s.charAt(i));
            } else {
                // 如果左边的[s.charAt(i)]大右边的[s.charAt(i+1)]，sum + 左边的
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LJSolution ljSolution = new LJSolution();
        System.out.println(ljSolution.romanToInt("DCXXI")); // 621
        System.out.println(ljSolution.romanToInt("CCCXLVIII")); // 348
    }

}
