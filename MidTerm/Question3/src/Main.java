/**
 * Question 3: Write java program uses abstract classes and methods,
 * the program should implement the design indicated in the UML diagram
 *
 * Write a main() method that creates a psychiatrist object and 2 moody objects.
 * The psychiatrist object will examine and observe each moodyObject.
 * Output of the program will look like below:
 * O/P:
 * How are you feeling today?
 * I feel happy Today
 * heeehee....hahahah...HAHAHA!!
 * Observation: Subject laughs a lot
 * How are you feeling today?
 * I feel sad Today
 * ‘waah’ ‘boo hoo’ ‘weep’ ‘sob ‘
 * Observation: Subject cries a lot
 */

public class Main {
    public static void main(String[] args) {
        Sad sad = new Sad();
        Happy happy = new Happy();
        Psychiatrist psychiatrist = new Psychiatrist();

        psychiatrist.examine(happy);
        System.out.println();
        psychiatrist.examine(sad);
    }
}
