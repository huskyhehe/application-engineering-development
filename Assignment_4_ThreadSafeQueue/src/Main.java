public class Main {
    public static void main(String[] args) {
        // Basic Test
        BasicTest test = new BasicTest();
        test.integerQueueTest();
        test.stringQueueTest();

        System.out.println("-------------------------------------");

        // Producer & Consumer Message-Passing Test
        ThreadSafeQueue<Message> msgQueue = new ThreadSafeQueue<>(10);
        Producer producer = new Producer(msgQueue);
        Consumer consumer = new Consumer(msgQueue);

        // start producer to produce messages in msgQueue
        new Thread(producer).start();

        // start consumer to consume messages from msgQueue
        new Thread(consumer).start();
    }
}