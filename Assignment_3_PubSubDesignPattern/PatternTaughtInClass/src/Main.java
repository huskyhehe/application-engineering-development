public class Main {
    public static void main(String[] args) {

        // Create one instance of SeattlePoliceDepartment
        SeattlePoliceDepartment police = new SeattlePoliceDepartment();

        // Create 3-4 instances of person
        Person bob = new Person("Bob");
        Person carrie = new Person("Carrie");
        Person eddie = new Person("Eddie");
        Person frank = new Person("Frank");

        // Subscribe some persons to SeattlePoliceDepartment
        bob.subscribe(police);
        carrie.subscribe(police);
        eddie.subscribe(police);
        frank.subscribe(police);

        // Publish a message from SeattlePoliceDepartment
        police.notifyCitizens("Man Wounded in North Seattle Shooting");

        // Unsubscribe 1 or 2 users from SeattlePoliceDepartment
        eddie.unsubscribe(police);
        frank.unsubscribe(police);

        // Publish the message again
        police.notifyCitizens("Man Wounded in North Seattle Shooting");
    }
}
