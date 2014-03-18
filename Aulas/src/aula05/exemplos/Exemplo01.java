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
public class Exemplo01 {

    public static void main(String[] args) {

        int numero = 0;
        //Utilizando a estrutura switch
        switch (numero) {
            case 0:
                JOptionPane.showMessageDialog(null, "O número informado é 0");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "O número informado é 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O número informado é 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O número informado é 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "O número informado é diferente de 0,1,2 e 3");
        }
    }
}
