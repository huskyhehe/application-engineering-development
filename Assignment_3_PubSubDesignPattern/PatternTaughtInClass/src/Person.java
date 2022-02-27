public class Person {

    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void subscribe(SeattlePoliceDepartment police) {
        if (!police.getPersons().contains(this)) {
            police.getPersons().add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment police) {
        police.getPersons().remove(this);
    }

    public void getNotification(SeattlePoliceDepartment police) {
        System.out.println("****************************************************");
        System.out.println("Citizen Name: " + this.getName());
        System.out.println("Notification: " + police.getNotifications().get(police.getNotifications().size() - 1));
    }
}
