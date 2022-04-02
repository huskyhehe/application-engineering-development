# Lambda
## Approach 1: Create Methods That Search for Members That Match One Characteristic
One simplistic approach is to create several methods; each method searches for members that match one characteristic, such as gender or age. The following method prints members that are older than a specified age:
```java
public static void printPersonsOlderThan(List<Person> roster, int age) {
    for (Person p : roster) {
        if (p.getAge() >= age) {
            p.printPerson();
        }
    }
}
```

## Approach 2: Create More Generalized Search Methods
The following method is more generic than printPersonsOlderThan; it prints members within a specified range of ages:

```java
public static void printPersonsWithinAgeRange(
    List<Person> roster, int low, int high) {
    for (Person p : roster) {
        if (low <= p.getAge() && p.getAge() < high) {
            p.printPerson();
        }
    }
}
```

## Approach 3: Specify Search Criteria Code in a Local Class
The following method prints members that match search criteria that you specify:

```java
public static void printPersons(
    List<Person> roster, CheckPerson tester) {
    for (Person p : roster) {
        if (tester.test(p)) {
            p.printPerson();
        }
    }
}
```

To specify the search criteria, you implement the CheckPerson interface:
```java
interface CheckPerson {
    boolean test(Person p);
}
```


## Approach 4: Specify Search Criteria Code in an Anonymous Class
One of the arguments of the following invocation of the method printPersons is an anonymous class that filters members that are eligible for Selective Service in the United States: those who are male and between the ages of 18 and 25:

printPersons(
    roster,
    new CheckPerson() {
        public boolean test(Person p) {
            return p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25;
        }
    }
);

- This approach reduces the amount of code required because you don't have to create a new class for each search that you want to perform. 
- However, the syntax of anonymous classes is bulky considering that the CheckPerson interface contains only one method. In this case, you can use a lambda expression instead of an anonymous class, as described in the next section.

## Approach 5: Specify Search Criteria Code with a Lambda Expression
The CheckPerson interface is a functional interface. 
A functional interface is any interface that contains only one abstract method. (A functional interface may contain one or more default methods or static methods.) Because a functional interface contains only one abstract method, you can omit the name of that method when you implement it. To do this, instead of using an anonymous class expression, you use a lambda expression, which is highlighted in the following method invocation:

```java
printPersons(
    roster,
    (Person p) -> p.getGender() == Person.Sex.MALE
        && p.getAge() >= 18
        && p.getAge() <= 25
);
```

## Approach 6: Use Standard Functional Interfaces with Lambda Expressions
Reconsider the CheckPerson interface:

interface CheckPerson {
    boolean test(Person p);
}


