/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class Exercicio03 {

    public static void main(String[] args) {
        //Primeiro número
        String numero1 = JOptionPane.showInputDialog(null, "Informe um número.", "Número 1", JOptionPane.INFORMATION_MESSAGE);
        //Segundo número
        String numero2 = JOptionPane.showInputDialog(null, "Informe um número.", "Número 2", JOptionPane.INFORMATION_MESSAGE);
        //Informe a operação +-*/
        String op = JOptionPane.showInputDialog(null, "Informe a operação.", "+ - * /", JOptionPane.INFORMATION_MESSAGE);

        //Converte os números para o tipo double
        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);
        double calculo = 0L;
        //Identifica se calculou. Se sim mostra o valor calculado.
        boolean calculou = false;

        switch (op) {
            case "+":
                calculo = n1 + n2;
                calculou = true;
                break;
            case "-":
                calculo = n1 - n2;
                calculou = true;
                break;
            case "*":
                calculo = n1 * n2;
                calculou = true;
                break;
            case "/":
                calculo = n1 / n2;
                calculou = true;
                break;
            default:
                calculou = false;
                JOptionPane.showMessageDialog(null, "Operação inválida!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        if (calculou) {
            JOptionPane.showMessageDialog(null, "Valor calculado: " + calculo, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
