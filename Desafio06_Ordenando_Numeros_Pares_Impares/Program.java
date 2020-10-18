package Desafio06_Ordenando_Numeros_Pares_Impares;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        Comparator<Integer> comp = Integer::compareTo;

        List<Integer> evenNumbers = list.stream()
                .filter(x -> x % 2 == 0)
                .sorted(comp)
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);

        List<Integer> oddNumbers = list.stream()
                .filter(x -> x % 2 != 0)
                .sorted(comp.reversed())
                .collect(Collectors.toList());

        oddNumbers.forEach(System.out::println);

        sc.close();
    }
}
