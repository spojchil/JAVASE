package com.chapter4.scanner;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        // 同一个包下不需要导入类
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int a = sc.nextInt();
        System.out.println("输入为" + a);

        // 会留下换行符
        String b = sc.next();  // 读取下一个字符串，空白符结束相等于scanf
        System.out.println("b = " + b);

        // 会丢弃换行符，读取到换行符结束
        sc.nextLine();
        b = sc.nextLine();
        System.out.println("b = " + b);

        sc.close();
    }
}
