/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exemplos;

/**
 * Números divisíveis por 1 e por ele mesmo. O único número primo que é par é o
 * 2.
 *
 * @author fabricio
 */
public class Exemplo06 {

    public static void main(String[] args) {
        int numero = 9;
        //o resultado da divisão não pode ser menor ou igual a 2
        int i = 2;
        boolean primo = true;
        //percorre enquanto o resultado da divisão não for menor ou igula a 2 
        //e o número não seja par
        while (primo && (i <= (numero / 2))) {
            if (numero % i == 0) {
                primo = false;
            } else {
                i++;
            }
        }
        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}
