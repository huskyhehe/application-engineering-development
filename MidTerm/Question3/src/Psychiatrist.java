/**
 * Psychiatrist Object:
 * //asks moody object about its mood
 * public void examine(moodyObject moodyObject);
 * //a moodyObject is observed to either laugh or cry
 * public void observe(moodyObject moodyObject);
 * //returns message about self: “Subject laughs a lot”
 * public String toString();
 */

public class Psychiatrist {

    public Psychiatrist() {}

    public void examine(Moody mood) {
        System.out.println("How are you feeling today?");
        mood.queryMood();
        mood.ExpressFeelings();
        observe(mood);
    }

    public void observe(Moody mood) {
        System.out.println("Observation: " + mood.toString());
    }
}
