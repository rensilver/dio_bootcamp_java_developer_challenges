package DIO_Challenges.Desafio09_Fila_De_Banco;

import java.util.*;

public class QueueBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> clientsSamePlace = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            List<Integer> naturalList = new ArrayList<>();
            List<Integer> finalList = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                int clients = sc.nextInt();

                naturalList.add(clients);
            }

            List<Integer> descendingList = new ArrayList<>(naturalList);
            descendingList.sort(Collections.reverseOrder());

            List<Integer> diffResult = new ArrayList<>();

            for (int k = 0; k < naturalList.size(); k++) {
                if (naturalList.get(k).equals(descendingList.get(k))) {
                    diffResult.add(1);
                }
            }
            finalList.add(diffResult.size());

            clientsSamePlace.addAll(finalList);
        }
        clientsSamePlace.forEach(System.out::println);
        sc.close();
    }
}