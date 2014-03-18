/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.exemplos;

import javax.swing.JOptionPane;

/**
 * Solicitar o nome e o sexo de uma pessoa. Exmplicar a utilização do charAt e
 * do switch com String.
 *
 * @author fabricio
 */
public class Exemplo02 {

    public static void main(String[] args) {
        String mensagem = null;
        //Capturar as informações digitadas pelo usuário.
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da pessoa.", "Nome Completo", JOptionPane.QUESTION_MESSAGE);
        String sexoEntrada = JOptionPane.showInputDialog(null, "Informe o sexo da pessoa.", "M - Masculino / F - Feminino", JOptionPane.QUESTION_MESSAGE);

        //Validação para pegar o sexo informado e coloca em caixa alta. Pega apenas a primeira letra.
        char sexo = sexoEntrada.toUpperCase().charAt(0);

        //Utilizando a estrutura switch, verificar o sexo da pessoa.
        switch (sexo) {
            case 'M':
                mensagem = "A pessoa com o nome " + nome + " é do sexo Masculino.";
                break;
            case 'F':
                mensagem = "A pessoa com o nome " + nome + " é do sexo Feminino.";
                break;
            default:
                mensagem = "Nâo foi possível identificar o sexo de " + nome;
                break;
        }

        //Mostrar uma mensagem para o usuário.
        JOptionPane.showMessageDialog(null, mensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);

    }
}
