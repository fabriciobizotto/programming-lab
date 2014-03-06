/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import java.util.Scanner;

/**
 * Conversor de moedas
 *
 * @author fabricio
 */
public class Exemplo6 {

    public static void main(String[] args) {
        double cotacaoDolar = 0, valorReal = 0, valorConvertido = 0;

        System.out.println("Converter real em dolar.");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a cotacao do dolar: ");
        cotacaoDolar = entrada.nextDouble();

        System.out.print("Informe o valor a ser convertido(R$): ");
        valorReal = entrada.nextDouble();

        valorConvertido = valorReal / cotacaoDolar;

        System.out.printf("O valor de " + valorReal + " convertido em dolar e: " + valorConvertido + " dolares\n");
    }
}
