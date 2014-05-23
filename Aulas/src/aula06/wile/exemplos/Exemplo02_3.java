/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.wile.exemplos;

/**
 * Decremento
 *
 * @author fabricio
 */
public class Exemplo02_3 {

    public static void main(String[] args) {
        int i;
        i = 2;
        int contador = 0;
        for (int n = 2; n < 100; n++) {
            boolean primo = true;

            while (primo && (i <= (n / 2))) {
                if (n % i == 0) {
                    primo = false;
                } else {
                    i++;
                }

            }

            if (primo == true) {
                System.out.println("Os Números primos entre 1 e 100 são: " + n);
                contador++;
            }
        }
        System.out.println("Contador: " + contador);
    }
}
