/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Crie um programa em Java que receba um inteiro, de 1 até 12, representando os
 * meses do ano e retorne o número de dias do mês. Use switch e não use break.
 * Use acúmulo de case.
 *
 * @author fabricio
 */
public class Exercicio04 {

    public static void main(String[] args) {
        int mes, dias = 31;
        String entrada = JOptionPane.showInputDialog(null, "Digite o número do mês [1-12]", JOptionPane.INFORMATION_MESSAGE);
        mes = Integer.parseInt(entrada);

        if (mes > 12 || mes < 1) {
            JOptionPane.showMessageDialog(null, "Mês Inválido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        switch (mes) {
            // fevereiro: subtraímos 2 dias aqui e 1 dia no próximo case
            case 2:
                dias -= 2;
            //meses que possuem 30 dias: só subtraímos 1 dia
            case 4:
            case 6:
            case 9:
            case 11:
                dias--;

        }
        JOptionPane.showMessageDialog(null, "O mês " + mes + " possui " + dias + " dias", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
}
