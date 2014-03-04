/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia e troque o valor de duas variáveis. Imprima os
 * valores trocados.
 *
 * @author fabricio
 */
public class Exercicio1 {

    public static void main(String[] args) {
        String var1;
        String var2;
        String auxiliar;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor da primeira variável: ");
        var1 = entrada.nextLine();
        System.out.print("Informe o valor da segunda variável: ");
        var2 = entrada.nextLine();

        auxiliar = var1;
        var1 = var2;
        var2 = auxiliar;

        System.out.println("Primeira variável: " + var1);
        System.out.println("Segunda variável: " + var2);

    }
}
