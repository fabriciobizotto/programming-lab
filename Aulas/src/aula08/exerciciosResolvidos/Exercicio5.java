package exercicios;

import javax.swing.*;

public class Exercicio5 {

    public static void main(String[] args) {
        int soma = 0;
        String entrada = "";

        while (entrada != null && !entrada.equals("0")) {
            entrada = JOptionPane.showInputDialog(null, "Informe um número ou zero para parar.");

            if (entrada != null && !entrada.equals("0")) {
                int numero = Integer.parseInt(entrada);
                soma += numero;
            }
            System.out.println("Valor: " + soma);
        }
    }
}
