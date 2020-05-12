package functional_programing;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List names= Arrays.asList("aswin","kumar","anji","raj","subu");

        names.stream()
                .filter(name -> !name.equals("aswin"))
                .forEach(name -> System.out.println(name));
    }
}
