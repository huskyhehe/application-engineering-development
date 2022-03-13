import java.nio.channels.InterruptedByTimeoutException;

public class OperationA implements Runnable{
    @Override
    public void run() {
        synchronized (Main.lockA){
            Main.queueA.add(5);
            try {
                Thread.sleep(5000);
            }catch (InterruptedByTimeoutException e) {
                e.printStackTrace();
            }

            synchronized (Main.lockA) {
                Main.queueA.add(75);
            }
        }
    }
}
