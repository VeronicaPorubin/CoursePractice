package Lesson9.HomeWork;

public class Employee {
    String name, adress;
    int yearOfJoining, salary;

    public Employee(String name, String adress, int yearOfJoining, int salary) {
        this.name = name;
        this.adress = adress;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;


    }

    public void display() {

        System.out.println(name + "           " + adress + "            " + yearOfJoining + "        " + salary);
    }

}
