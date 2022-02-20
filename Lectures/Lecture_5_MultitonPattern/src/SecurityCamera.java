/**
 * create a class
 * create a private static HashMap for the class with id, class
 * create static private object for locking
 * create a public method which will return the class instance for particular id
 * if the id is not initialized:
 *      double locked and create a new instance and add it in the Hashmap
 * if the id exists:
 *      return the value from HashMap
 */

import java.util.HashMap;

public class SecurityCamera {

    private static HashMap<Integer, SecurityCamera> cameras = new HashMap<>();

    private SecurityCamera() {}

    private static Object obj = new Object();

    public static SecurityCamera getCamera(int id) {
        if (cameras.containsKey(id)) {
            synchronized (obj) {
                if (!cameras.containsKey(id)) {
                    cameras.put(id, new SecurityCamera());
                }
            }
        }
        return cameras.get(id);
    }
}
