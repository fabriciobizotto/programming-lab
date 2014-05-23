/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.wile.exemplos;

/**
 * Loop infinito
 *
 * @author fabricio
 */
public class Exemplo02_2 {

    public static void main(String[] args) {
        int i = 0;
        int cont = 5;

        while (i < 10) {
            System.out.println("loop=" + i);
            while (cont < 10) {
                System.out.println("i=" + i++);
                System.out.println("cont=" + cont++);
            }
        }
    }
}
