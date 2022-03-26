public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Sara", "info1001", 3.95f);
        Student student2 = new Student(student1);
        Student student3 = student1;

        System.out.println("Student1's Name: " + student1.getName());
        System.out.println("Student2's Name: " + student2.getName());
        System.out.println("Student3's Name: " + student3.getName());

        student1.setName("Carrie");

        System.out.println("Student1's Name: " + student1.getName());
        System.out.println("Student2's Name: " + student2.getName());
        System.out.println("Student3's Name: " + student3.getName());
    }
}
