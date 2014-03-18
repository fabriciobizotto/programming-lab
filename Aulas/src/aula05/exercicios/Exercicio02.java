/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.exercicios;

import javax.swing.JOptionPane;

/**
 * Verificar qual é o estado da região sul correspondente a sigla informada.
 *
 * @author fabricio
 */
public class Exercicio02 {

    public static void main(String[] args) {
        String mensagem = null;
        //Capturar as informações digitadas pelo usuário.
        String sigla = JOptionPane.showInputDialog(null, "Informe a sigla de um estado da região sul do Brasil", "Sigla", JOptionPane.QUESTION_MESSAGE);

        //Caixa alta
        sigla = sigla.toUpperCase();

        //Utilizando a estrutura switch, verificar o sexo da pessoa.
        switch (sigla) {
            case "SC":
                mensagem = sigla + " - Santa Catarina";
                break;
            case "PR":
                mensagem = sigla + " - Paraná";
                break;
            case "RS":
                mensagem = sigla + " - Rio Grande do Sul";
                break;
            default:
                mensagem = "A sigla " + sigla + " não pertence a nenhum estado da região sul do Brasil.";
        }

        //Mostrar uma mensagem para o usuário.
        JOptionPane.showMessageDialog(null, mensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);

    }
}
