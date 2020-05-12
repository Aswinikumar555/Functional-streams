package collectioniterators;

import lambdaExcises.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationEx {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("aswin", "Akumar", 21),
                new Person("raj", "airan", 40),
                new Person("tharun", "kandula", 21),
                new Person("rams", "app", 21)
        );

        System.out.println(" for loop   ");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("for each");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println(" lambda for each ");
        people.forEach(p -> System.out.println(p));

        System.out.println("  foreach print statment   ");
        people.forEach(System.out::println);
    }
}
