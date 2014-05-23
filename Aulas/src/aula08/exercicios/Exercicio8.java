package exercicios;

import javax.swing.*;

public class Exercicio8 {

    public static void main(String[] args) {
        String lado1 = "", lado2 = "", lado3 = "", continuar = "S";

        while (continuar.toUpperCase().equals("S")) {
            lado1 = JOptionPane.showInputDialog(null, "Informe o lado 1.");
            lado2 = JOptionPane.showInputDialog(null, "Informe o lado 2.");
            lado3 = JOptionPane.showInputDialog(null, "Informe o lado 3.");

            int l1 = Integer.parseInt(lado1);
            int l2 = Integer.parseInt(lado2);
            int l3 = Integer.parseInt(lado3);

            if ((l1 < (l2 + l3)) && (l2 < (l1 + l3)) && (l3 < (l1 + l2))) {
                if (l1 == l2 && l2 == l3) {
                    JOptionPane.showMessageDialog(null, "Triângulo Equilátero.");
                } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                    JOptionPane.showMessageDialog(null, "Triângulo Isosceles.");
                } else if (l1 != l2 || l2 != l3 || l3 != l1) {
                    JOptionPane.showMessageDialog(null, "Triângulo Escaleno.");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível identificar o tipo do triângulo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não é um triângulo!");
            }
            continuar = JOptionPane.showInputDialog(null, "Deseja continuar? [S]Sim, [N]não.", "", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
