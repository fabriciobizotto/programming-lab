package exercicios;

import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {
        int idade = 0;

        while (idade < 60) {
            String entrada_nome = JOptionPane.showInputDialog(null, "Informe seu Nome");
            if (entrada_nome == null) {
                break;
            }
            String entrada_idade = JOptionPane.showInputDialog(null, "Informe seu Nome");
            if (entrada_idade == null) {
                break;
            }

            idade = Integer.parseInt(entrada_idade);

            if (idade < 18) {
                int qtd = entrada_nome.equals("Michele") ? 3 : 5;
                for (int i = 0; i < qtd; i++) {
                    System.out.println(entrada_nome);
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    System.out.println(entrada_nome);
                }
            }
        }
    }
}
