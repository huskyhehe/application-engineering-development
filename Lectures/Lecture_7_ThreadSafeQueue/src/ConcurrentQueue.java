import java.util.LinkedList;

public class ConcurrentQueue {

    private Queue<T> queue;

    public Object objLock = new Object();

    public ConcurrentQueue() {
        synchronized ()
        queue = new LinkedList<>();
    }
}
