package com.chapter4.aswitch;

import java.util.Scanner;

public class aswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int a = input.nextInt();
        // 四种switch
        // 传统switch Java5之前
        // 选择对象只支持int short byte char
        // 需要break防止穿透, 无返回值
        String b;
        switch (a) {
            case 1:
                b = "选择了1";
                break;
            case 2:
                b = "选择了2";
                break;
            default:
                b = "选择了非1非2";
                break;
        }
        System.out.println("b = " + b);
        input.close();

    }
}
