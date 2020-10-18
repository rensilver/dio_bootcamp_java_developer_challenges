package Desafio01_positiveOrNegatives;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        for (int i=0; i<6; i++) {
            String values = sc.nextLine();
            list.add(values);
        }

        int positive = 0;
        for(String positiveNumber : list) {
            if (positiveNumber.equals("0") || positiveNumber.equals("null")) {
                continue;
            }
            if (!(positiveNumber.charAt(0) == '-')) {
                positive += 1;
            }
        }

        System.out.println(positive + " valores positivos");
    }
}
