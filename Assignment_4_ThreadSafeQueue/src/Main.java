public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Init an Integer ThreadSafeQueue
        ThreadSafeQueue<Integer> intQueue = new ThreadSafeQueue<>(5);

        // Test add function
        intQueue.add(5);
        intQueue.add(10);
        intQueue.add(15);
        intQueue.add(20);
        intQueue.add(25);
        intQueue.printData();

        // Test isFull function
        System.out.println("isFull: " + intQueue.isFull());

        // Test remove function
        System.out.println("remove data: " + intQueue.remove());
        System.out.println("remove data: " + intQueue.remove());
        intQueue.printData();

        // Test peek function
        System.out.println("peek data: " + intQueue.peek());

        // Test isEmpty function
        System.out.println("isEmpty: " + intQueue.isEmpty());


        System.out.println("--------------------------------------------------");


        // Init a String ThreadSafeQueue
        ThreadSafeQueue<String> strQueue = new ThreadSafeQueue<>(10);

        // Test add function
        strQueue.add("Amy");
        strQueue.add("Bob");
        strQueue.add("Carrie");
        strQueue.add("Doris");
        strQueue.add("Eric");
        strQueue.printData();

        // Test isFull function
        System.out.println("isFull: " + strQueue.isFull());

        // Test remove function
        System.out.println("remove data: " + strQueue.remove());
        System.out.println("remove data: " + strQueue.remove());
        strQueue.printData();

        // Test peek function
        System.out.println("peek data: " + strQueue.peek());

        // Test isEmpty function
        System.out.println("isEmpty: " + strQueue.isEmpty());
    }
}

