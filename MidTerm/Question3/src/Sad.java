/**
 * Sad Object:
 * //returns string indicating sad
 * public String getMood();
 * //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
 * public void expressFeelings();
 * //returns message about self : “Subject cries a lot”
 * public String toString();
 */

public class Sad extends Moody {

    @Override
    String getMood() {
        return "Sad";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("waah...boo hoo...weep...sob");
    }

    public String toString() {
        return "Subject cries a lot";
    }
}
