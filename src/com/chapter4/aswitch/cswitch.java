package com.chapter4.aswitch;

import java.util.Scanner;

public class cswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String  a = input.next();
        // 四种switch
        // 有返回值，不会穿透，支持多值,复杂逻辑使用yield
        String b = switch (a) {
            case "1" -> "选择了1";
            case "2", "3" -> {
                if (a.equals("2"))
                    yield "选择了2";
                else yield "选择了3";
            }
            default -> "选择了非1非2非3";
        };
        System.out.println("b = " + b);
        input.close();

    }
}
