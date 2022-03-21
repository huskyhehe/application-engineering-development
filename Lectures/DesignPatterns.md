# Design Patterns

## 1 Singleton Pattern
The singleton pattern is one of the simplest design patterns.  

Definition:
The singleton pattern is a design pattern that restricts the instantiation of a class to one object.  

Singletons often control access to resources, such as database connections or sockets.  

For example, if you have a license for only one connection for your database or your JDBC driver has trouble with multithreading, the Singleton makes sure that only one connection is made or that only one thread can access the connection at a time.

The easiest implementation consists of:
 * a private constructor
 * a field to hold its result
 * a static accessor method with a name like getInstance().
```java
 * public class Singleton {
 *     private Singleton() { }                    // a private constructor
 *     private static Singleton _instance;        // a field to hold its result
 *     public static Singleton getInstance() {    // a static accessor method
 *         if (_instance == null) {
 *             _instance = new Singleton();
 *         }
 *         return _instance;
 *     }
 * }
```


## 3 PubSub Design Pattern
### Application:
- The publisher-subscriber is a familiar concept given the rise of YouTube, Facebook and other social media services. 
### Basic concept:
- a `Publisher` who generates content
- a `Subscriber` who consumes content
- a `ContentServer` that sits between publisher and subscriber to help mediate the messaging
- Whenever the Publisher generates content, each Subscriber is notified. Subscribers can theoretically be subscribed to more than one publisher.

### Implementations:
Usually, the pub-sub design pattern is implemented with a **multithreaded** view in mind.
One of the more common implementations sees each Subscriber as a **separate thread**, with the `ContentServer` managing a thread pool.

#### Publisher
```java
public class Publisher {
    ...
    public Publisher(Topic t) {
        this.topic = t;
    }

    public void publish(Message m) {
        ContentServer.getInstance().sendMessage(this.topic, m);
    }
}
```
#### ContentServer
```java
public class ContentServer {
    private Hashtable<Topic, List<Subscriber>> subscriberLists;

    private static ContentServer serverInstance;

    public static ContentServer getInstance() {
        if (serverInstance == null) {
            serverInstance = new ContentServer();
        }
        return serverInstance;
    }

    private ContentServer() {
        this.subscriberLists = new Hashtable<>();
    }
    
    public sendMessage(Topic t, Message m) {
        List<Subscriber> subs = subscriberLists.get(t);
        for (Subscriber s : subs) {
            s.receivedMessage(t, m);
        }
    }

    public void registerSubscriber(Subscriber s, Topic t) {
        subscriberLists.get(t).add(s);
    }
```
#### Subcriber
```java
public class Subscriber {
    public Subscriber(Topic...topics) {
        for (Topic t : topics) {
            ContentServer.getInstance().registerSubscriber(this, t);
        }
    }
    
    public void receivedMessage(Topic t, Message m) {
        switch(t) {
            ...
        }
    }
}
```
