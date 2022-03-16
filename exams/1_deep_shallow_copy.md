# Contents
| | Shallow Copy | Deep Copy |
| -| -- | -- |
| Cloned object & source object | are not disjoint completely | are completely independent of each other | 
| Speed | fast | slow |
| Will changes made in the cloned instance impact the reference variable of the source object? | Yes | No |
| Condition preferred:|  if class variables of the object are only primitive type as fields |  if the object’s class variables have references to other objects as fields. |

```java
ublic class Student {
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
```
```java
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: " + student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());

        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+ student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());
    }
}
```