/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class Exemplo03 {

    public static void main(String[] args) {
        String mensagem = null;
        String diaDaSemana = JOptionPane.showInputDialog(null, "Informe o dia da semana", "Dia da Semana", JOptionPane.INFORMATION_MESSAGE);

        switch (diaDaSemana) {
            case "Segunda":
                mensagem = "Inicio da Semana";
                break;
            case "Terça":
            case "Quarta":
            case "Quinta":
                mensagem = "Meio da Semana";
                break;
            case "Sexta":
                mensagem = "Final da Semana";
                break;
            case "Sabado":
            case "Domingo":
                mensagem = "Fim de Semana";
                break;
            default:
                mensagem = "Dia Inválido!";
                break;
        }
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
