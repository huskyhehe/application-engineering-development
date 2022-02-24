import java.util.ArrayList;

public class Professor extends Person {
    String quiz;
    ArrayList<Student> students;

    public Professor(String name, String id, int age) {
        super(name, id, age);
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getQuiz() {
        return quiz;
    }

    public void giveQuiz(String quiz) {
        this.quiz = quiz;
        for (Student student : students) {
            student.takeQuiz(this);
        }
    }
}
