import java.util.Date;

public class Mammal extends Animal {
    public Mammal(String name, Date birth) {
        super(name, birth);
        System.out.println("I am inside the Mammal constructor");
    }
}
