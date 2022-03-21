## 1 Copy Constructor
```java
public class Student {
    int id;
    String name;

    // Normal Parameterized Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
    }

    public String getId() {
        return Integer.toString(this.id);
    }

    public String getName() {
        return this.name;
    }
```
```java
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(101, "ABC");

        // Call the copy constructor
        Student student2 = new Student(student1);

        Student student3 = student1;
    }
}
```

## 3 Inheritance


