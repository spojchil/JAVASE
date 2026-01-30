package com.chapter5.a_array;

public class aarray {
    public  static void main(String[] args) {
        // 动态初始化
        int[] a = new int[3];
        System.out.println("查看默认值" + a[0]);
        // 为0

        String[] a1 = new String[3];
        System.out.println("查看默认" + a1[0]);
        // 为null

        // 静态初始化
        int[] b = {1, 2, 3};
        // 获取长度, 这里length没有括号，这是属性不是方法
        System.out.println(b.length);
        System.out.println("输出数组地址" + b);  // [I@27716f4
        // [ 表示数组,I 表示整数,@是分割符27716f4是对象的哈希值

    }
}
