package Desafio11_Ordenacao_Palavras_Por_Tamanho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Words {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<String> listFinal = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());

            for (int i=0; i<n; i++) {

                String line = br.readLine();
                String[] items = line.split(" ");

                List<String> wordsList = new ArrayList<>(Arrays.asList(items));

                Comparator<String> comp = Comparator.comparing(String::toUpperCase);
                Comparator<String> compLength = Comparator.comparingInt(String::length);

                List<String> naturalOrder = wordsList.stream()
                        .sorted(comp)
                        .collect(Collectors.toList());

                List<String> finalOrder = naturalOrder.stream()
                        .sorted(compLength.reversed())
                        .collect(Collectors.toList());

                String joined = finalOrder.stream().map(Object::toString).collect(Collectors.joining(" "));

                listFinal.add(joined);

            }
            for (String k : listFinal) {
                System.out.println(k);
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
