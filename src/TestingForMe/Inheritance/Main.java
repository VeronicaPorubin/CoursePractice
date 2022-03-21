package TestingForMe.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("Porubin Veronica", "Mircea cel Batran 34");
        Student student = new Student ("Sandu Cristian", "Alecu Russo 4", "Informatica", 23, 5000 );
        Staff staff = new Staff("Iovu Alexandra", "Alexei Mateevici 68", "Universitatea de Stat din Moldova", 12000 );

        System.out.println(person);
        System.out.println(staff);
        System.out.println(student);
    }
}
