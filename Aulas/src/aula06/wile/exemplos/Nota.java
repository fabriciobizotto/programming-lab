package aula06.wile.exemplos;

import javax.swing.JOptionPane;

public class Nota {

    public static void main(String args[]) {
        String entrada = "";
        int contador = 0;
        double soma = 0, nota = 0;
        while (entrada != null && !entrada.equals("x")) {
            entrada = JOptionPane.showInputDialog(null, "Informe a nota.", "", JOptionPane.INFORMATION_MESSAGE);
            if (entrada != null && !entrada.equals("x")) {
                nota = Double.parseDouble(entrada);
                //soma as notas
                soma += nota;
                contador++;
            }
        }
        //calcula a média final
        //Imprime a soma / contador
        Double media = soma / contador;
        JOptionPane.showMessageDialog(null, media + "");
    }
}
