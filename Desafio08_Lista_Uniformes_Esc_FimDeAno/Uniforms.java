package DIO_Challenges.Desafio08_Lista_Uniformes_Esc_FimDeAno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Uniforms {

    private String color;
    private String size;
    private String student;

    public Uniforms(String color, String size, String student) {
        this.color = color;
        this.size = size;
        this.student = student;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getStudent() {
        return student;
    }

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<Uniforms> list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());

            for (int i = n; i > 0; i--) {
                String name = br.readLine();
                String uniforms = br.readLine();
                String[] item = uniforms.split(" ");

                list.add(new Uniforms(item[0], item[1], name));

            }

            List<Uniforms> sortedList = list.stream()
                    .sorted(Comparator.comparing(Uniforms::getColor).thenComparing(Uniforms::getStudent))
                    .collect(Collectors.toList());

            List<Uniforms> sortedSize = sortedList.stream()
                    .sorted(Comparator.comparing(Uniforms::getSize).reversed())
                    .collect(Collectors.toList());

            List<Uniforms> sortedFinal = sortedSize.stream()
                    .sorted(Comparator.comparing(Uniforms::getColor))
                    .collect(Collectors.toList());

            sortedFinal.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

   @Override
    public String toString() {
        return color + " " + size + " " + student;
    }
}