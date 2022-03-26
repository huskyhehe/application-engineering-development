## Interface
- A is capable of [doing this]  
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
- A is a B  
- abstract classes cannot be instantiated  
eg:  
The Car class, which extends the Vehicle class, overrides all the methods by providing the car's implementation details (“Car is a Vehicle”).
```java
abstract class Animal {
    // declare fields

    // non-abstract methods
    public void eat() {
        System.out.println("I can eat.")
    }
    // abstract methods
    abstract void makeSound();
}
```
```java
class Dog extends Animal {
    // provide implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
}
```
```java
class Main {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog puppy = new Dog();

        puppy.makeSound();
        puppy.eat();

        // Output:   
        // Bark bark
        // I can eat.
    }
}
```