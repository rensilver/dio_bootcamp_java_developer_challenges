package Desafio12_Encontre_Maior_Substring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FindSubstring {

    public static void main(String[] args) {

        List<Integer> listRole = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

            do {
                String lineOne = sc.nextLine();
                if (lineOne.isEmpty()) {
                    break;
                }

                String lineTwo = sc.nextLine();
                if (lineTwo.isEmpty()) {
                    break;
                }

                int m = lineOne.length();
                int n = lineTwo.length();

                listRole.add(LongestSubstring(lineOne.toCharArray(), lineTwo.toCharArray(), m, n));

            } while (true);

            listRole.forEach(System.out::println);
    }


    public static int LongestSubstring(char X[], char Y[], int m, int n) {

        int[][] subStuff = new int[m + 1][n + 1];
        int result = 0;

        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0) {
                    subStuff[i][j] = 0;
                }
                else if (X[i - 1] == Y[j - 1]) {
                    subStuff[i][j] = subStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result, subStuff[i][j]);
                }
                else
                    subStuff[i][j] = 0;
            }
        }
        return result;
    }
}
