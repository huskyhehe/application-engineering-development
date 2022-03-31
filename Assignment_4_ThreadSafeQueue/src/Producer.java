public class Producer implements Runnable {

    private ThreadSafeQueue<Message> msgQueue;

    public Producer(ThreadSafeQueue<Message> msgQueue) {
        this.msgQueue = msgQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Message msg = new Message("I'm msg " + i);
            try {
                Thread.sleep(10);
                msgQueue.add(msg);
                System.out.println("Producer: Message - " + msg.getMessageData() + " produced.");
            } catch (Exception e) {
                System.out.println("Exception:" + e);
            }
        }
        System.out.println("Producing finished.");
    }
}