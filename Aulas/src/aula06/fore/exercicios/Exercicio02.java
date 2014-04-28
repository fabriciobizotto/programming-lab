/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exercicios;

/**
 * Utilizando o exemplo dos números primos, mostre o números primos entre 1 e 100.
 * Além de informar se o número é primo, mostre o total de números primos
 * encontrados.
 *
 * @author fabricio
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 2; i <= 100; i++) {
            int cont = 2;
            boolean primo = true;
            //percorre enquanto o resultado da divisão não for menor ou igula a 2 
            //e o número não seja par
            while (primo && (cont <= (i / 2))) {
                if (i % cont == 0) {
                    primo = false;
                } else {
                    cont++;
                }
            }
            if (primo) {
                total++;
                System.out.println("O número " + i + " é primo.");
            }
        }
        System.out.println("Total: " + total);
    }
}
