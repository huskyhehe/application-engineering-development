/**
 * Singleton Pattern
 *
 * The easiest implementation consists of:
 * a private constructor
 * a field to hold its result
 * a static accessor method with a name like getInstance().
 *
 * public class SingletonExample {
 *     private SingletonExample() { }                    // a private constructor
 *     private static SingletonExample _instance;        // a field to hold its result
 *     public static SingletonExample getInstance() {    //a static accessor method
 *         if (_instance == null) {
 *             _instance = new SingletonExample();
 *         }
 *         return _instance;
 *     }
 * }
 */

/**
 * create a class
 * default constructor as private
 * create private static instance of the class called _instance
 * create a public function which
 */

public class Camera {
    private static Camera _instance;

    // A private Constructor prevents any other class from instantiating.
    private Camera() {}

    // A static method to create instance of Camera class
    public static Camera getInstance() {
        if (_instance == null) {
            _instance = new Camera();
        }
        return _instance;
    }
}
