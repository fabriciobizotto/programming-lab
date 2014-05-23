package exercicios;

import javax.swing.*;

public class Exercicio1 {

    public static void main(String[] args) {
        int idade = 0;

        String entrada = JOptionPane.showInputDialog(null, "Informe a idade.");
        idade = Integer.parseInt(entrada);

        if (idade < 16) {
            System.out.println("Você não pode dirigir.");
        } else if (idade > 16 && idade < 18) {
            System.out.println("Você pode votar mas não pode dirigir.");
        } else if (idade > 18) {
            System.out.println("Você é maior de idade.");
        }
    }
}
