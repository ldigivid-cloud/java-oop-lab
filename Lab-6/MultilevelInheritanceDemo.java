// Base class (Grandparent)
class Person {
    String name;
    int age;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (Parent)
class Student extends Person {
    String studentId;

    void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
    }
}

// Derived class from Student (Child)
class GraduateStudent extends Student {
    String researchTopic;

    void displayGraduateInfo() {
        displayPersonInfo();
        displayStudentInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent();
        grad.name = "John Doe";
        grad.age = 24;
        grad.studentId = "GS2023";
        grad.researchTopic = "Artificial Intelligence in Healthcare";

        grad.displayGraduateInfo();
    }
}
