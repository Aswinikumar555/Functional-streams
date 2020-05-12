package lambdaExcises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printLastnamewith(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("A")) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("aa", "Fhh", 80),
                new Person("aa", "a", 80),
                new Person("aa", "CCCC", 80),
                new Person("aa", "AA", 80)
        );
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(people);

        printLastnamewith(people);

        //condition
        printConditionally(people,new Condition(){

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

    }


    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }
}
