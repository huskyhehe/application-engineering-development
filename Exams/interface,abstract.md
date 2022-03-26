## Interface
A is capable of [doing this]  
eg:  
“Sender is capable of sending a file”. ImageSender implements the interface for sending an image to the target.
```java
public interface Sender {
    void send(File fileToBeSent);  
    // no need to write detailed method
}
public class ImageSender implements Sender {
    @Override
    public void send(File fileToBeSent) {
        // image sending implementation code.
    }
}
```

## Abstract Class
A is a B  
eg:  
The Car class, which extends the Vehicle class, overrides all the methods by providing the car's implementation details (“Car is a Vehicle”).
```java
public abstract class Vehicle {

    // declare fields
       
    // declare abstract methods
    protected abstract void start();
    protected abstract void stop();
    protected abstract void changeGear();
    
    // declare nonabstract methods
    // such as standard getters and setters
}
```
```java
public class Car extends Vehicle {

    @Override
    protected void start() {
        // code implementation details on starting a car.
    }

    @Override
    protected void stop() {
        // code implementation details on stopping a car.
    }

    @Override
    protected void changeGear() {
        // code implementation details on changing the car gear.
    }
}
```