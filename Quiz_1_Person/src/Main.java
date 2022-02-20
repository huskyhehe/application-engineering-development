public class Main {

    public static void main(String[] args) {
        Student mark = new Student("Mark", "neu001", 24);
        Professor ashish = new Professor("Ashish","neu111",30);

        ashish.giveQuiz("What's the relationship between Person and Student?");
        mark.takeQuiz("Student is the subclass of Person");
    }
}
