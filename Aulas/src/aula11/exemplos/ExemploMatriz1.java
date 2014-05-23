/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.exemplos;

import java.util.Arrays;
import java.util.Random;

/**
 * Crie um aplicativo em Java que peça ao usuário para preencher uma matriz 4x3
 * com valores inteiros e depois exiba essa matriz.
 *
 * @author fabricio
 */
public class ExemploMatriz1 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][3];
        Random r = new Random();
        //Cria a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = r.nextInt(10);
            }
        }
        //Percorre e imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
//        System.out.println(Arrays.deepToString(matriz));
    }
}
