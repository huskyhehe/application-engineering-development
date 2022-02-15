import java.util.Date;

public class Elephant extends Mammal {
    boolean isFemale;

    public Elephant(String name, Date birth) {
        super(name, birth);
    }

    public Elephant(String name, Date birth, boolean isFemale) {
        super(name, birth);
        this.isFemale = isFemale;
        System.out.println("I am inside the Elephant constructor");
    }
}
