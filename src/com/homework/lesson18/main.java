package com.homework.lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int k;
            System.out.println();
            System.out.println("1. First exercise.");
            System.out.println("2. Second exercise.");
            System.out.println("3. Third exercise.");
            System.out.println("4. Exit!");
            k = scanner.nextInt();

            switch (k){
                case 1:
                    Employee employee1 = new Employee("Alice", 6);
                    Employee employee2 = new Employee("Vlad", 3);
                    Employee employee3 = new Employee("Robert", 9);
                    Employee employee4 = new Employee("Katy", 13);
                    Employee employee5 = new Employee("Alex", 10);
                    Employee employee6 = new Employee("Vicky", 4);
                    Employee [] employees = {employee1, employee2, employee3, employee4, employee5,employee6};
                    ArrayList <Employee> list = Employee.verifyEmployee(employees);
                    Employee.executeEmployees(list);
                    break;

                case 2:
                    UniqueValues values = new UniqueValues();
                    UniqueValues.stringValues();
                    break;
                case 3:
                    Dictionary str1 = new Dictionary();
                  Dictionary.dictionaryList();
                  break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("You used the wrong option!");




            }
        }
    }
}
