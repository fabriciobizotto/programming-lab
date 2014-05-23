package exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Informe um número inteiro.", "", JOptionPane.INFORMATION_MESSAGE);
        int n = Integer.parseInt(numero);

        int contador = 0;
//        boolean continuar = true;
        System.out.println(n + " ");
        while (n >= 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            System.out.println(n + " ");
//            continuar = n > 1;
            contador++;
            if(n == 1){
                break;
            }
        }
        System.out.println("Precisou de " + contador + " passos para chegar a 1.");
    }
}
