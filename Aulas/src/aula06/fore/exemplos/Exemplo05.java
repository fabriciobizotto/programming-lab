/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exemplos;

/**
 * for dentro do outro (Matriz)
 *
 * @author fabricio
 */
public class Exemplo05 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Linha " + i);
            for (int j = 0; j < 5; j++) {
                System.out.print("  Coluna " + j+"  ");
            }
            System.out.println();
        }
    }
}
