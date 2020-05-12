package lambdaException;

import java.util.function.BiConsumer;

public class Lambdaexception {
    public static void main(String[] args) {
        int[] someValues = {1, 2, 3, 4, 5};
        int key = 0;

        printValues(someValues, key, (v, k) -> {
            try {
                System.out.println(v / k);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        });
    }

    private static void printValues(int[] someValues, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someValues) {
            biConsumer.accept(i, key);
        }
    }
}
