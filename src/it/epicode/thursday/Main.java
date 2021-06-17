package it.epicode.thursday;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Insert your number:");
        int number = c.nextInt();
        fizzBuzzOriginal(number);
    }
    public static void fizzBuzzOriginal(int a) {
        for (int i = 1; i < a; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
//fizzbuzz con metodo if, else if e con la stampa ogni line.