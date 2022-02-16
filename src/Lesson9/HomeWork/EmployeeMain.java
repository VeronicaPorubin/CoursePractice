package Lesson9.HomeWork;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee [] array = new Employee[3];

        System.out.println("Employee name" + "   " +  "Adress" + "        "  + "YearOfJoining" + "     " + "Salary");
        array [0]= new Employee ("Alex", "Puskin 11", 2019, 9000 );
        array [1] = new Employee("Maxim", "Dacia 23", 2020, 4500);
        array [2] = new Employee("Alice", "Dimo 1/5", 2012, 10200);

        for (Employee employees : array) {
            employees.display();

        }




    }
}
