package lambdaExcises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortLambda {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("aswin", "Akumar", 21),
                new Person("raj", "airan", 40),
                new Person("tharun", "kandula", 21),
                new Person("rams", "app", 21)
        );

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        printAll(people);

        System.out.println("Start with A");
        printCondtionWith(people, (p) -> p.getLastName().startsWith("A"));

        //predicate
        System.out.println(" predicate ");
        predicateCondion(people,(p)->p.getLastName().startsWith("A"));

        //Unsorted list
        List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");

        //1. Natural order
        List<String> sortedNames = names
                .stream()
                .sorted(Comparator.comparing(String::toString))
                .peek((p)->System.out.println("peek "+p))
                .collect(Collectors.toList());

        System.out.println("sorted Array "+sortedNames);
        //2. Reverse order
        List<String> reverseSortedNames = names
                .stream()
                .sorted(Comparator.comparing(String::toString).reversed())
                .peek((p)->System.out.println("peek reverseSortedNames"+p))
                .collect(Collectors.toList());
        System.out.println("reverseSortedNames Array "+reverseSortedNames);
    }

    private static void predicateCondion(List<Person> people, Predicate<Person> predicate) {
        for (Person p:people){
            if (predicate.test(p)){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printCondtionWith(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }


    interface Condition {
        boolean test(Person p);
    }


    //predicate


}

