# Design Patterns
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
