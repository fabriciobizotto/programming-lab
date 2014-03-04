package exercicios;

import java.util.Scanner;

/**
 * Desenvolver um algoritmo (ou programa) que converta uma quantidade de horas
 * digitadas pelo usuário em minutos. Informe o resultado em minutos.
 *
 * @author fabricio
 */
public class Exercicio3 {

    public static void main(String[] args) {
        int horas;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de horas: ");
        horas = entrada.nextInt();

        System.out.println("Total em minutos: " + (horas * 60));

    }
}
