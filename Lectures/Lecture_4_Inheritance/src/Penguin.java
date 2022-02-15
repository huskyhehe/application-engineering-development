import java.util.Date;

public class Penguin extends Bird implements iFly {

    public Penguin(String name, Date birth) {
        super(name, birth);
    }

    @Override
    public void fly() {
        
    }
}
