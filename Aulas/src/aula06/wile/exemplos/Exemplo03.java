/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.wile.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class Exemplo03 {

    public static void main(String[] args) {
        String nome = "";
        while (nome != null && !nome.equals("0")) {
            nome = JOptionPane.showInputDialog(null, "Informe um nome ou [0] para parar.", "", JOptionPane.INFORMATION_MESSAGE);
            if (nome != null) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome);
            }
        }
    }
}
