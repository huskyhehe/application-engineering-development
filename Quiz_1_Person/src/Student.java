public class Student extends Person {

    public Student(String name, String id, int age) {
        super(name, id, age);
    }

    public void takeQuiz(String answer) {
        System.out.println("Quiz Answer");
    }
}
