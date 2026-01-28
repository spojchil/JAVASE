package com.chapter4.caishuzi;

import java.util.Random;
import java.util.Scanner;

public class caishuzi {
    public static void main(String[] args) {
        System.out.println("这是一个猜数字小游戏");
        System.out.println("让你猜一个1-100之间的数字");
        System.out.println("我会说大了小了");

        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("请输入你的猜测");
            int num = input.nextInt();
            if (num > randomNum){
                System.out.println("猜大了");
            } else if (num < randomNum){
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜您猜中了");
                break;
            }
        }
        input.close();
    }
}
