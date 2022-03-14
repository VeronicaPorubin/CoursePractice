package com.homework.lesson18;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int yearsOfActivity;

    public Employee(String name, int yearsOfActivity) {
        this.name = name;
        this.yearsOfActivity = yearsOfActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity(int yearsOfActivity) {
        this.yearsOfActivity = yearsOfActivity;
    }
    public static ArrayList<Employee> verifyEmployee (Employee [] employees){
        ArrayList <Employee> list = new ArrayList<>();
        for (Employee employee : employees){
            if (employee.getYearsOfActivity() >=5){
                list.add(employee);
            }
        }
        return list;
    }
    public static void executeEmployees (ArrayList <Employee> list){
        for (Employee employee : list){
            System.out.println(employee);
        }
    }
    @Override
    public String toString () {
        return "Employee name: " + name + ", " + "years of activity: " + yearsOfActivity + ".";
    }
}
