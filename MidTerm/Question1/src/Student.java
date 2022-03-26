/**
 * Question 1: Deep copy shallow copy:
 * What is a Deep copy and what is a shallow copy.
 * Create a class of Student and demonstrate shallow copy vs deep copy for student class.
 * Student class will have members as name,studentID, gpa
 * write getters and setters for the members
 */

public class Student {
    String name;
    String id;
    float gpa;

    // Normal Parameterized Constructor
    public Student(String name, String id, float gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Copy Constructor
    public Student(Student student) {
        this.name = student.name;
        this.id = student.id;
        this.gpa = student.gpa;
    }

    // Getters and Setts
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
