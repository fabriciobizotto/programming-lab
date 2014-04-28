/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.wile.exemplos;

/**
 * Encontrar a primeira potência de 3 maior que 100.
 *
 * @author fabricio
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int numero = 3;

        while (numero <= 100) {
            numero = 3 * numero;
        }
        System.out.println("Número: " + numero);
    }
}
