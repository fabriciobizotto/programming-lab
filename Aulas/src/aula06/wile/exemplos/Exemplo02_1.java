/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.wile.exemplos;

/**
 * Percorrer i 10 vezes e dentro de cada loop de i percorrer 2 vezes o cont.
 *
 * @author fabricio
 */
public class Exemplo02_1 {

    public static void main(String[] args) {
        int i = 0;
        int cont = 0;

        while (i < 10) {
            System.out.println("i=" + i++);
            while (cont < 2) {
                System.out.println("cont=" + cont++);
            }
            cont = 0;
        }
    }
}
