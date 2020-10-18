package DIO_Challenges.Desafio07_Remove_Duplicates_Alfabetic_Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    private String name;

    public Program(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<Program> list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());

            for (int i=1; i<=n; i++) {
                String name = br.readLine();
                String[] item = name.split(" ");
                Set<String> set = new TreeSet<>(Arrays.asList(item));

                String joined = set.stream().map(Object::toString).collect(Collectors.joining(" "));

                list.add(new Program(joined));
            }
            for (Program f : list) {
                System.out.println(f);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        return name;
    }
}
