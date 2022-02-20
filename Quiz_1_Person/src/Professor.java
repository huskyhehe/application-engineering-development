public class Professor extends Person {

    public Professor(String name, String id, int age) {
        super(name, id, age);
    }

    public void giveQuiz(String question) {
        System.out.println("Quiz Question");
    }
}
