/******************************************************
 * Question1:
 * Implement given program using copy constructor by
 * creating a class Student with two parameter
 ******************************************************/

public class Student {
    int rollNumber;
    String name;

    // Normal Parameterized Constructor
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Copy Constructor
    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }

    public String printRoll() {
        return Integer.toString(this.rollNumber);
    }

    public String printName() {
        return this.name;
    }
}
