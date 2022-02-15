import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Elephant("Lisa", new Date(), true));
        animals.add(new Lion("Barbee", new Date()));

        ArrayList<Elephant> elephants = new ArrayList<>();

        zoo.setAnimals(animals);
    }



}
