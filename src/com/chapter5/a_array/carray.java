package com.chapter5.a_array;

import java.util.Arrays;

public class carray {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        // Java 的二维数组，内存可能不连续，外层数组中的元素是引用
        // 允许每个元素不等长，
        a[0] = new int[]{1, 2, 3};
        a[1] = new int[]{4, 5};
        a[2] = new int[]{6};

        // 不会递归调用
        System.out.println(Arrays.toString(a));
    }
}
