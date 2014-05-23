/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class Exercicio04 {

    public static void main(String args[]) {
        double notas = 0;
        int cont = 0;
        String nota = "";
        while (nota != null && !nota.equals("x")) {
            nota = JOptionPane.showInputDialog(null, "Informe uma nota ou [x] para sair", "", JOptionPane.INFORMATION_MESSAGE);
            if (nota != null && !nota.equals("x")) {
                double n = Double.parseDouble(nota);
                notas += n;
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("Média: " + (notas / cont));
        }

    }
}
