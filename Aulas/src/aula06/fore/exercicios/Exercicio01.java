/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exercicios;

/**
 *
 * @author fabricio
 */
public class Exercicio01 {

    public static void main(String[] args) {
        String texto = "Laboratório de Programação";
        int total = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a') {
                total++;
            }
        }
        System.out.println("Total: " + total);
    }
}
