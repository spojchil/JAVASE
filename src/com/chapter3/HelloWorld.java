package com.chapter3;


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // println是自动加换行的print不加换行
        System.out.println("Hello World");
        int a = 10;
        // sout 打印补全
        System.out.println(a);
        // a.sout 直接带变量，也有soutv等其他输出格式
        System.out.println(a);
        // Ait+Enter 自动修复代码本行
        int b = (int) 3.4;
        // 自动导入包
        Scanner in = new Scanner(System.in);

        in.close();

        int c = 10;
        c = c++;  // 反编译为++c
    }
}
