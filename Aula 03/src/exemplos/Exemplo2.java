/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class Exemplo2 {

    public static void main(String args[]) throws ParseException {
        String nome;
        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual é o seu nome?\n");
        nome = entrada.nextLine();
        System.out.print("Olá " + nome + "!, qual é a sua idade?\n");
        idade = entrada.nextInt();
        System.out.println("Você sabia que em cinco anos você terá " + (idade + 5)
                + " anos e cinco anos antes você tinha " + (idade - 5) + "?");

    }

}
