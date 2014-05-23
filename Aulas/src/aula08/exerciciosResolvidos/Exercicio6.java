package aula08.exerciciosResolvidos;

import javax.swing.*;

public class Exercicio6 {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Informe um número inteiro.");

        int n = Integer.parseInt(numero);
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
