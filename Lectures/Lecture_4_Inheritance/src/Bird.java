import java.util.Date;

public class Bird extends Animal {
    public Bird(String name, Date birth) {
        super(name, birth);
    }

    @Override
    public void eat() {
        System.out.println("eat something");
    }
}
