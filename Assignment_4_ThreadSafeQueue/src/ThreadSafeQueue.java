/**
 * Create a class of Thread safe Queue
 * The methods of queue would be following:
 * 1. void add(T data)
 * 2. T remove()
 * 3. T peek()
 * 4. boolean isEmpty()
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * This answer combined the knowledge taught in class
 * with the LinkedBlockingQueue source code,
 * achieve thread-safe by using Lock interface.
 *
 * "Comparing to implicit locking via the synchronized keyword,
 * the Java Concurrency API supports various explicit locks specified by the Lock interface.
 * Locks support various methods for finer grained lock control
 * thus are more expressive than implicit monitors."
 */

public class ThreadSafeQueue<T> {
    Node<T> head, tail;
    int size;                               // the current amount of nodes
    int capacity;                           // the largest amount of nodes the queue can hold
    private final Lock lock = new ReentrantLock();
    Condition notEmpty = lock.newCondition();
    Condition notFull = lock.newCondition();

    public ThreadSafeQueue(int capacity) {
        this.capacity = capacity;
        tail = head = null;
    }

    public void add(T data) throws InterruptedException {
        lock.lock();
        try {
            while (size == capacity)
                notFull.await();
            // enqueue
            enqueue(data);
            size ++;
            if (size + 1 < capacity)
                notFull.signal();
        } finally {
            lock.unlock();
        }

        if (size == 0) {
            lock.lock();
            try {
                notEmpty.signal();
            } finally {
                lock.unlock();
            }
        }
    }


    public T remove() throws InterruptedException {
        T dataToRemove;
        lock.lock();
        try {
            while (size == 0)
                notEmpty.await();
            // dequeue
            dataToRemove = dequeue();
            size --;
            if (size > 1)
                notEmpty.signal();
        } finally {
            lock.unlock();
        }

        if (size == capacity) {
            lock.lock();
            try {
                notFull.signal();
            } finally {
                lock.unlock();
            }
        }
        return dataToRemove;
    }


    public T peek() throws InterruptedException {
        while (size == 0)
            notEmpty.await();
        return head.data;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean isFull() {
        return size == capacity;
    }



    // Print data in the ThreadSafeQueue
    public void printData() {
        if(head == null) System.out.println("head is null");

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    // Basic enqueue & dequeue method
    private void enqueue(T data){
        Node<T> newNode = new Node<T>(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    private T dequeue() {
        if (head == null) return null;
        T dataToRemove = head.data;
        Node temp = head;
        head = head.next;

        if (head == null) tail = null;
        return dataToRemove;
    }
}
