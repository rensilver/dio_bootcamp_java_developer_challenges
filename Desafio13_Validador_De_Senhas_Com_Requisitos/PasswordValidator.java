package Desafio13_Validador_De_Senhas_Com_Requisitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> listString = new ArrayList<>();

        while (sc.hasNextLine()) {

            String pwd = sc.nextLine();
            if (pwd.isBlank()) {
                break;
            }
            else {
                listString.add(pwd);
            }

        }
        for (String password : listString) {
            int validRequirements = 0;
            String validPwd = "Senha valida.";
            String invalidPwd = "Senha invalida.";
            boolean hasUppercase = !password.equals(password.toLowerCase());
            boolean hasLowercase = !password.equals(password.toUpperCase());
            boolean hasSpecial = password.matches("[A-Za-z0-9]*");
            boolean isMinimum = password.length() >= 6;
            boolean isAtLeast32 = password.length() <= 32;

            if (hasUppercase) {
                validRequirements += 1;
            }
            if (hasLowercase) {
                validRequirements += 1;
            }
            if (hasSpecial) {
                validRequirements += 1;
            }
            if (isMinimum) {
                validRequirements += 1;
            }
            if (isAtLeast32) {
                validRequirements += 1;
            }

            if (validRequirements == 5) {
                System.out.println(validPwd);
            }
            else {
                System.out.println(invalidPwd);
            }
        }
        sc.close();

    }

}
