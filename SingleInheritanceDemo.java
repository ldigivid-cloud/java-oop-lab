// Superclass (Parent)
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass (Child) that inherits from Person
class Student extends Person {
    String studentId;

    void displayStudentInfo() {
        displayInfo(); // call parent class method
        System.out.println("Student ID: " + studentId);
    }
}

// Main class to run the program
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alice";
        student.age = 20;
        student.studentId = "S101";

        student.displayStudentInfo();
    }
}
