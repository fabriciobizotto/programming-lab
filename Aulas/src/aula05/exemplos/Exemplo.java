/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.exemplos;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class Exemplo {

    public static void main(String[] args) {
        double valor_i, valor_f, juros = 0;
        int meses;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o valor inicial da dívida: ");
        valor_i = entrada.nextDouble();

        System.out.print("Você vai atrasar quantos meses [0-5]?: ");
        meses = entrada.nextInt();

        switch (meses) {
            case 5:
                juros++;
            case 4:
                juros++;
            case 3:
                juros++;
            case 2:
                juros++;
            case 1:
                juros++;
                break;
            default:
                System.out.println("Você não digitou um valor válido de meses");
        }
        System.out.println("Juros: " + juros + "%");
        valor_f = ((1 + (juros / 100)) * valor_i);
        System.out.printf("Valor final da dívida: R$ %.2f", valor_f);
        System.out.println();

    }
}
