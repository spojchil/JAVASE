package com.chapter6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class chishiduix {
    public  static void main(String[] args) {
        // OOP 面向对象程序设计
        // 类之间的关系有依赖、聚合和继承
        /*
        *  依赖 ("uses-a")
        *  聚合 ("has-a")
        *  继承 ("is-a")
        *
        * */

        // 查看日期
        System.out.println(new Date());

        // 对象变量
        Date d;  // 这只是一个对象变量，还没有引用Date类型的变量

        LocalDate ld = LocalDate.now();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        ld = ld.minusDays(day);
        DayOfWeek dow = ld.getDayOfWeek();
        int value = dow.getValue();
    }
}
