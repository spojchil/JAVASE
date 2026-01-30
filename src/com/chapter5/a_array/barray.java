package com.chapter5.a_array;

import java.util.Arrays;

public class barray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        // 复制数组
        int[] b = new int[3];

        // a.fori
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        //  System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));

        // 扩容方法，创建一个新的数组

    }
}
