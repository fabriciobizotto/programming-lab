/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exemplos;

/**
 * percorre os inteiros pares de 0 a 20 e imprime a soma;
 *
 * @author fabricio
 */
public class Exemplo02 {

    public static void main(String[] args) {
        //0 + 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 = 110
        int total = 0;

        for (int i = 0; i <= 20; i += 2) {
            total += i;
        }
        System.out.println("Total: " + total);
    }
}
