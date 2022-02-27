import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeattlePoliceDepartment {

    private List<String> notifications = new ArrayList<>();
    private List<Person> persons = new ArrayList<>();

    public SeattlePoliceDepartment() {
        this.notifications = new ArrayList<>();
        this.persons = new ArrayList<>();
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void notifyCitizens(String newNotification){
        this.notifications.add(newNotification);

        Iterator personsIterator =this.persons.iterator();

        while (personsIterator.hasNext()) {
            Person person =(Person)personsIterator.next();
            person.getNotification(this);
        }
    }
}
