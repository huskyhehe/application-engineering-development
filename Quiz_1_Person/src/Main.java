public class Main {

    public static void main(String[] args) {
        Professor ashish = new Professor("Ashish","neu111",30);
        Student mark = new Student("Mark", "neu001", 24);
        
        ashish.giveQuiz("What's the relationship between Person and Student?");
        mark.takeQuiz("Student is the subclass of Person");
    }
}
