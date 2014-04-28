/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exercicios;

/**
 * Sabendo que a primeira copa do mundo ocorreu no ano de 1930, verifique todos
 * os anos em que ocorreram os jogos da copa do mundo e o total de copas até o
 * ano de 2014. Imprimir os anos em que ocorreram copas e o total de copas.
 *
 * @author fabricio
 */
public class Exercicio03 {

    public static void main(String args[]) {
        int anoInicial = 1930;
        int anoFinal = 2014;
        boolean auxiliar = true;
        int contador = 1;

        System.out.println("O ano de " + anoInicial + " foi ano de copa do mundo!");
        while (auxiliar) {
            System.out.println("O ano de " + (anoInicial += 4) + " foi ano de copa do mundo!");
            contador++;
            if (anoFinal <= anoInicial) {
                auxiliar = false;
            }
        }
        System.out.println("Total de " + contador + " copas do mundo!");
    }
}
