package exercicios;

import javax.swing.*;

public class Exercicio4 {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Informe um número inteiro");
        int n = Integer.parseInt(numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
    }
}
