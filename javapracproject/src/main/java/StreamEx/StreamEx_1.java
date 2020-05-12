package StreamEx;

import lambdaExcises.Person;

import java.util.Arrays;
import java.util.List;

public class StreamEx_1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("aswin", "Akumar", 21),
                new Person("raj", "airan", 40),
                new Person("tharun", "kandula", 21),
                new Person("rams", "Cpp", 21),
                new Person("gdsa", "Akumar", 21),
                new Person("dsfraj", "aidfran", 40),
                new Person("datharun", "kdfandula", 21),
                new Person("rdfdams", "CasdCppdf", 21)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("A"))
                .peek(System.out::println)
                .forEach(p -> System.out.println(p.getLastName()));

        System.out.println("start with c");

        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        System.out.println(count);

        people.stream()
                .filter(p -> p.getFirstName().length() > 2)
                .forEach(p -> System.out.println(p.getLastName()))
        ;
    }
}
