package com.chapter4.arandom;

import java.util.Random;

public class arandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt();  // 在int范围内随机取一个值

        System.out.println("a = " + a);

        int b = rand.nextInt(10); // 在0到9 之间取一个整数
        System.out.println("b = " + b);

        int c = rand.nextInt(3, 10);  // 3到9，包含起始
        System.out.println("c = " + c);
    }
}
