package Desafio14_Pedra_Papel_Tesoura_Lagarto_Spock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<String> listOfAnswers = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                String gameChoices = br.readLine();
                if (gameChoices.equals("pedra pedra")) { listOfAnswers.add("empate"); }
                if (gameChoices.equals("papel papel")) { listOfAnswers.add("empate"); }
                if (gameChoices.equals("tesoura tesoura")) { listOfAnswers.add("empate"); }
                if (gameChoices.equals("lagarto lagarto")) { listOfAnswers.add("empate"); }
                if (gameChoices.equals("spock spock")) { listOfAnswers.add("empate"); }
                if (gameChoices.equals("papel pedra")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("tesoura papel")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("pedra lagarto")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("lagarto spock")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("spock tesoura")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("tesoura lagarto")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("lagarto papel")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("papel spock")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("spock pedra")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("pedra tesoura")) { listOfAnswers.add("fernanda"); }
                if (gameChoices.equals("pedra papel")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("papel tesoura")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("lagarto pedra")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("spock lagarto")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("tesoura spock")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("lagarto tesoura")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("papel lagarto")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("spock papel")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("pedra spock")) { listOfAnswers.add("marcia"); }
                if (gameChoices.equals("tesoura pedra")) { listOfAnswers.add("marcia"); }
            }
            listOfAnswers.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
