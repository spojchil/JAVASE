package com.chapter4.aswitch;

import java.util.Scanner;

public class dswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("请输入一个字符串");
// 类型模式匹配
        Object obj = "Hello";
        String result = switch (obj) {
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            case null -> "Null value";
            default -> "Unknown type";
        };

// 守卫模式（when）
        String response = switch (obj) {
            case String s when s.length() > 5 -> "Long string";
            case String s -> "Short string";
            case Integer i when i > 0 -> "Positive number";
            case Integer i -> "Non-positive number";
            default -> "Other";
        };
        input.close();

    }
}
