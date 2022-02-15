import java.util.Date;

public class Lion extends Mammal {
    public Lion(String name, Date birth) {
        super(name, birth);
        System.out.println("I am inside the Lion constructor");
    }

    @Override
    public void eat() {
        System.out.println("I am eating yummy mammals");
    }
}
