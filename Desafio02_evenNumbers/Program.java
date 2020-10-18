package Desafio02_evenNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int realNumber = n + 1;

        for(int i=1; i<=realNumber - 1; i++) {
            if (i%2 == 0) {
                array.add(i);
            }
        }
        for (Integer arr : array) {
            sb.append(arr);
            sb.append("\n");
        }
        String str = sb.toString();
        System.out.print(str);
        sc.close();
    }
}
