/**
 * Moody object :
 * // Return the mood : sad or happy – depending on which object sends the message
 * abstract String getMood();
 * // Each Object expresses a different motion
 * abstract void ExpressFeelings();
 * //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
 * Public void queryMood()
 */

public abstract class Moody {

    // abstract methods
    abstract String getMood();
    abstract void ExpressFeelings();

    // non-abstract methods
    public void queryMood() {
        System.out.println("I feel " + getMood() + " today !!");
    }
}
