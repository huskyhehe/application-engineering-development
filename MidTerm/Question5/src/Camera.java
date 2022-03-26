/**
 * Question 5:  Singleton:
 * Create a singleton class for Camera
 * there would be just one instance of Camera
 */

public class Camera {

    private Camera() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static Camera _instance;
    private static Object obj = new Object();
    private String name = "";

    // double-checked locking
    public static Camera getInstance() {
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }
}