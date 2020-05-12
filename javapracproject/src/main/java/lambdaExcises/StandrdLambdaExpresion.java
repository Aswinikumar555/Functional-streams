package lambdaExcises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandrdLambdaExpresion {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("aswin", "Akumar", 21),
                new Person("raj", "airan", 40),
                new Person("tharun", "kandula", 21),
                new Person("rams", "app", 21)
        );

        printAllWith(people,p->p.getLastName().startsWith("A"),p-> System.out.println(p));

        printAllWith(people,p->p.getLastName().startsWith("A"),p-> System.out.println(p.getLastName()));
    }

    private static void printAllWith(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
