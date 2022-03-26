/**
 * Happy Object:
 * //returns string indicating happy
 * public String getMood();
 * //print laughter string “heeehee....hahahah...HAHAHA!!”
 * public void expressFeelings();
 * //returns message about self: “Subject laughs a lot”
 * public String toString();
 */

public class Happy extends Moody{

    @Override
    String getMood() {
        return "Happy";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString() {
        return "Subject laughs a lot";
    }
}
