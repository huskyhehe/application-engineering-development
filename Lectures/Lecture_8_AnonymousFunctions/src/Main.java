import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // approach 1: needs a SimpleThread class
        Thread th = new Thread(new SimpleThread());
        th.start();

        // approach 2: needs a SimpleThread class
        new Thread(new SimpleThread()).start();

        // approach 3: does not need other class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am inside a simple thread in the main class");
            }
        }).start();

        // approach 4: Lambda function (single line) does not need other class
        new Thread(() -> System.out.println("I am inside the main class with Lambda function")).start();

        // approach 4: Lambda function (multiple lines)
        new Thread( () -> {
            System.out.println("first line");
            System.out.println("second line");
            System.out.println("third line");
        }).start();



        // Example
        List<Employee> employees = new ArrayList<>();
//        Collections.sort(employees, (emp1, emp2) -> emp1.age.compareTo(emp2.age));


        SimpleString strClass = new SimpleString();
        System.out.println(strClass.upperCassAndConcat("abc", "def"));

        System.out.println(new SimpleString().upperCassAndConcat("sss", "fff"));

        IStringFunctions isf = (str1, str2) -> {
            return str1.toLowerCase() + str2.toUpperCase();
        };
    }
}
