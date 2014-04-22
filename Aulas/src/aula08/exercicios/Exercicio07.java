/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.exercicios;

/**
 *
 * @author fabricio
 */
public class Exercicio07 {

    public static void main(String[] args) {
        int somaPar = 1, somaImpar = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            } else {
                somaImpar += i;
            }
        }
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);
    }
}
