/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este exercicio nao foi passado em aula. Desenvolver um algoritmo (ou
 * programa) que calcule a média aritmética de vários valores inteiros positivos
 * informados pelo usuário. O final da leitura acontecerá quando for lido um
 * valor negativo.
 *
 * @author fabricio
 */
public class Exercicio2 {

    public static void main(String[] args) {
        int valores[] = new int[3];
        int valor;
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        while (cont < valores.length) {
            System.out.print("Informe um número: ");
            valor = entrada.nextInt();
            if (valor > 0) {
                valores[cont++] = valor;
            } else {
                break;
            }
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.printf(valores[i] + "\n");
        }
    }
}
