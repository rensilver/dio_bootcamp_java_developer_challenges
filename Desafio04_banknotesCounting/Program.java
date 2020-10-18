package Desafio04_banknotesCounting;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int realNumber = n;

            int bankNote100 = 0;
            int bankNote50 = 0;
            int bankNote20 = 0;
            int bankNote10 = 0;
            int bankNote5 = 0;
            int bankNote2 = 0;
            int bankNote1 = 0;

            for (int i=0; i<1000000; i++) {
                if (100 <= n) {
                    n -= 100;
                    bankNote100 += 1;
                }
                else if (50 <= n) {
                    n -= 50;
                    bankNote50 += 1;
                }
                else if (20 <= n) {
                    n -= 20;
                    bankNote20 += 1;
                }
                else if (10 <= n) {
                    n -= 10;
                    bankNote10 += 1;
                }
                else if (5 <= n) {
                    n -= 5;
                    bankNote5 += 1;
                }
                else if (2 <= n) {
                    n -= 2;
                    bankNote2 += 1;
                }
                else if (1 <= n) {
                    n -= 1;
                    bankNote1 += 1;
                }
            }
            System.out.print(realNumber + "\n");
            System.out.print(bankNote100 + " nota(s) de R$ 100,00" + "\n");
            System.out.print(bankNote50 + " nota(s) de R$ 50,00" + "\n");
            System.out.print(bankNote20 + " nota(s) de R$ 20,00" + "\n");
            System.out.print(bankNote10 + " nota(s) de R$ 10,00" + "\n");
            System.out.print(bankNote5 + " nota(s) de R$ 5,00" + "\n");
            System.out.print(bankNote2 + " nota(s) de R$ 2,00" + "\n");
            System.out.print(bankNote1 + " nota(s) de R$ 1,00" + "\n");

            sc.close();
    }
}
