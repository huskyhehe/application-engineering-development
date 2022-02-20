/**
 *
 * The singleton pattern is one of the simplest design patterns.
 *
 * Definition:
 * The singleton pattern is a design pattern that
 * restricts the instantiation of a class to one object.
 *
 * Singletons often control access to resources,
 * such as database connections or sockets.
 * For example, if you have a license for only one connection
 * for your database or your JDBC driver has trouble with multithreading,
 * the Singleton makes sure that only one connection is made
 * or that only one thread can access the connection at a time.
 */

public class Main {

    public static void main(String[] args) {
        Camera cam1 = Camera.getInstance();
        Camera cam2 = Camera.getInstance();

        System.out.println("Hashcode of x is " + cam1.hashCode());
        System.out.println("Hashcode of y is " + cam2.hashCode());

        // Condition check
        System.out.println(cam1 == cam2);

        // true
        // 2 objects point to the same memory location on the heap i.e, to the same object
    }
}
