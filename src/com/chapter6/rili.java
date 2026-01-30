package com.chapter6;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class rili {
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate ld = LocalDate.now();
        // 获取当前月数
        int month = ld.getMonthValue();
        // 获取当前天数
        int today = ld.getDayOfMonth();

        // 设置为当月第一天
        ld = ld.minusDays(today - 1);
        DayOfWeek dow = ld.getDayOfWeek();
        int value = dow.getValue();  // 1=Monday, ..., 7=Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        // 打印第一行前面的空格
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        // 打印日历
        while (ld.getMonthValue() == month) {
            System.out.printf("%3d", ld.getDayOfMonth());

            // 标记今天
            if (ld.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            ld = ld.plusDays(1);

            // 如果是周日，换行
            if (ld.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        // 如果最后一天不是周日，换行
        if (ld.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}