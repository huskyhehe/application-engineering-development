# 4 Design Pattern
## 4.1 Singleton
```java
public class Singleton {

    // a private default constructor
    private Singleton() {} 

    // a private field to hold its result                   
    private static Singleton _instance;

    //a public static accessor method
    public static Singleton getInstance() {      
        if (_instance == null)
              _instance = new Singleton();
        return _instance;
    }
}
```

This is how you create singleton design pattern
* 1. Create a class
* 2. Default constructor as private
* 3. Create Private static instance of the class called _instance
* 4. Create a public function which will get you instance of the Class in step 3
* 5. Create a private static object which will be used in locking the instance
* 6. In the function created in step 4 Lock the creation of object
* 7. Optionally Do double locking for performance
    * */
```java
public class Camera {

    // 1. Default constructor as private
    private Camera() {}

    // 2. Create Private static instance of the class called _instance
    private static  Camera _instance;

    // 3. Create a private static object which will be used in locking the instance
    private static Object obj = new Object();

    // 4. Create a public function which will get you instance of the Class in step 3
    public static Camera getInstance() {
        if(_instance == null) {            
            synchronized (obj) {
                // 5. Optionally Do double locking for performance
                if(_instance == null) {
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Camera cam1 = Camera.getInstance();
        Camera cam2 = Camera.getInstance();

        System.out.println("Hashcode of x is " + cam1.hashCode());
        System.out.println("Hashcode of y is " + cam2.hashCode());

        // Condition check
        System.out.println(cam1 == cam2);
        // true
        // because two objects point to the same memory location on the heap i.e, to the same object
    }
}
```

## 4.2 Pubsub
