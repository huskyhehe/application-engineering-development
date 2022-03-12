import java.util.Random;

public class Consumer implements Runnable{

    @Override
    public void run() {
        Random rand = new Random();
        int counter = 1;
        while(true) {
            String fish = Main.fishMarket.remove(0);

        }
    }
}
