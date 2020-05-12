package codeforce;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age%2==0 && age>2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
