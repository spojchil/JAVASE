package com.chapter6;

import java.time.LocalDate;

public class EmployeeTest {
    // static 静态
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("CC", 75000, 1987, 12, 15);
        staff[1] = new Employee("HH", 50000, 1989, 10, 1);
        staff[2] = new Employee("TT", 40000, 1990, 3, 15);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("名字:" + e.getName() + ", 工资:" + e.getSalary()
            + ",入职日期" + e.getHireDay() + "  Id: " + e.getId());
    }
}

class Employee {
    private final String name;
    private double salary;
    private final LocalDate hireDay;  // 雇佣日期
    // 静态属于类，不属于单个对象
    private static int nextId = 1;
    private final int id;
    // 构造函数，无返回值，无void，名称和类名相同
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        // 识别null n == null 或者 Object.requireNonNUll(n, "unknown")
        salary = s;
        hireDay = LocalDate.of(year, month, day);
        id = nextId++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    // 可以用来测试
    public static void main(String[] args) {
        Employee e = new Employee("CC", 7500, 1987, 12, 15);
        System.out.println("名字:" + e.getName() + ", 工资:" + e.getSalary()
                + ",入职日期" + e.getHireDay() + "  Id: " + e.getId());
    }
}