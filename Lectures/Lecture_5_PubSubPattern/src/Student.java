public class Student extends Person {

    public Student(String name, String id, int age) {
        super(name, id, age);
    }

    public void subscribe(Professor prof) {
        if (! prof.getStudents().contains(this))
            prof.getStudents().add(this);
    }

    public void unSubscribe(Professor prof) {
        prof.getStudents().remove(this);
    }

    public void takeQuiz(Professor prof){
        System.out.println("****************************************");
        System.out.println("Professor Name: " + prof.getName());
        System.out.println("Student Name: " + this.getName());
        System.out.println("Quiz : " + prof.getQuiz());
    }
}
