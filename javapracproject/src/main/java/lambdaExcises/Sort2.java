package lambdaExcises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort2 {

    private static void printPersons(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printLastNameWith(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.getLastName().startsWith("A"));
        }
    }

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("aswin", "Akumar", 21),
                new Person("raj", "airan", 40)
        );
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o1.getLastName().compareTo(o2.getLastName()));
            }
        });

        printPersons(people);

        printLastNameWith(people);


        printLastNameCondionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                System.out.println("in");
                return p.getLastName().startsWith("A");
            }
        });

    }

    private static void printLastNameCondionally(List<Person> people,Condition condition) {
        System.out.println("out");
        for (Person p:people){
            if (condition.test(p)){
                System.out.println(p);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }

}
