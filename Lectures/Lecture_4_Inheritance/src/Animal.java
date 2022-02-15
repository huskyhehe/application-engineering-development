import java.util.Date;

public abstract class Animal {
    private String name;
    private Date birth;

    public Animal() {}

    public Animal(String name, Date birth) {
        this.name = name;
        this.birth = birth;
        System.out.println("I am inside the Animal constructor");
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public abstract void eat();
}
