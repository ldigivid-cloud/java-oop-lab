// Base class
class Person {
    String name;
    int age;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// First child class
class Student extends Person {
    String studentId;

    void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Student ID: " + studentId);
    }
}

// Second child class
class Teacher extends Person {
    String subject;

    void displayTeacherInfo() {
        displayPersonInfo();
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        // Student object
        Student s = new Student();
        s.name = "Alice";
        s.age = 20;
        s.studentId = "ST123";
        System.out.println("Student Information:");
        s.displayStudentInfo();

        System.out.println();

        // Teacher object
        Teacher t = new Teacher();
        t.name = "Mr. Smith";
        t.age = 40;
        t.subject = "Mathematics";
        System.out.println("Teacher Information:");
        t.displayTeacherInfo();
    }
}
