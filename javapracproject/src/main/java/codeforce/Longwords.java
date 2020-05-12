package codeforce;

import java.util.Scanner;

public class Longwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String words = null;
        for (int i = 0; i <= number; i++) {
            words = sc.nextLine();
            if (words.length() > 10) {
                System.out.print(words.charAt(0));
                System.out.print(words.length() - 2);
                System.out.println(words.charAt(words.length() - 1));
            } else {
                System.out.println(words);
            }
        }

    }
}
