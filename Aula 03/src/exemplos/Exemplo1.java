/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.printf("Sua idade e: "+ idade + "\n");

    }

}
