import java.util.ArrayList;

public class Main {
    public static ArrayList<String> fishMarket = new ArrayList<>();

    public static void main(String[] args) {

        Thread[] fisherMens = new Thread[5];
        Thread[] consumers = new Thread[10];

        for (int i = 0; i < fisherMens.length; i++) {
            fisherMens[i] = new Thread(new FisherMan());
            fisherMens[i].setName("Fisher" + i);
            fisherMens[i].start();
        }

        for (int i = 0; i < consumers.length; i++) {
            consumers[i] = new Thread(new FisherMan());
            consumers[i].setName("Fisher" + i);
            consumers[i].start();
        }
    }
}
