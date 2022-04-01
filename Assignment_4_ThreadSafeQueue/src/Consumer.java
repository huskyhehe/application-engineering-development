public class Consumer implements Runnable {

    private ThreadSafeQueue<Message> msgQueue;

    public Consumer(ThreadSafeQueue<Message> msgQueue) {
        this.msgQueue = msgQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!msgQueue.isEmpty()) {
            try {
                Thread.sleep(10);
                Message msg = msgQueue.remove();
                System.out.println("Consumer: Message - " + msg.getMessageData() + " consumed.");
            } catch (Exception e) {
                System.out.println("Exception:" + e);
            }
        }
        System.out.println("Consuming finished.");
    }
}