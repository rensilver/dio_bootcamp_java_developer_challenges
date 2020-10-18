package Desafio03_evenOdd_positiveNegative_numbers;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;
        for (int i=0; i<5; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
            if (n > 0) {
                positive += 1;
            }
            else if (n < 0) {
                negative += 1;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
