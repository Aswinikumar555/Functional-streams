package lambdaException;

import java.util.function.BiConsumer;

public class LambdaWxception_2 {
    public static void main(String[] args) {

        int[] someValues = {1, 2, 3, 4, 5};
        int key =4;

        process(someValues, key, wrapper((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] someValues, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someValues) {
            biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> biConsumer) {
        return (v, k) -> {
            try {
                biConsumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        };
    }
}
