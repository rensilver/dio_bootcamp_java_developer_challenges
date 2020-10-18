package Desafio10_Gincana_Acampamento_emandamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Gymkhana {

    private String name;
    private Integer token;

    public Gymkhana(String name, Integer token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public Integer getToken() {
        return token;
    }

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            while (n != 0) {
                List<Gymkhana> gymkhanaList = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    String line = br.readLine();
                    String[] transf = line.split(" ");

                    gymkhanaList.add(new Gymkhana(transf[0], Integer.parseInt(transf[1])));
                }


                int m = Integer.parseInt(br.readLine());
                n = m;

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



   /*public String winnerSet(int loopNumber) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = loopNumber;
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                String[] transf = line.split(" ");
                List<Gymkhana> gymkhanaList = new ArrayList<>();
                gymkhanaList.add(new Gymkhana(transf[0], Integer.parseInt(transf[1])));

                if ()
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/



    @Override
        public String toString() {
            return name + " " + token;
        }
}
