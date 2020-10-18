package Desafio05_ConsumoMedioCombustivel;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String kms = sc.nextLine();
        double realKMs = Double.parseDouble(kms);
        String fuel = sc.nextLine();
        double realFuel = Double.parseDouble(fuel);

        double result = realKMs / realFuel;

        System.out.printf("%.3f km/l %n", result);

        sc.close();
    }
}
