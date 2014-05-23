/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.serhmatica.elegibilidade;

import java.util.Arrays;
import java.util.Random;

/**
 * Simular a mega-sena
 *
 * @author fabricio
 */
public class MegaSena {

    public static void main(String args[]) {
        int quantidade = 10;
        int numeros = 6;

        int[][] jogos = new int[quantidade][numeros];

        Random r = new Random();
        //Popular o array com os números jogos criados.
        for (int linha = 0; linha < quantidade; linha++) {
            for (int coluna = 0; coluna < numeros; coluna++) {
                int numeroRandomico = r.nextInt(60);
                while (numeroRandomico <= 0) {
                    numeroRandomico = r.nextInt(60);
                }
                jogos[linha][coluna] = numeroRandomico;
            }
        }
        //Imprime os jogos criados.
        System.out.println("***||imprime os jogos do usuário||***");
        for (int linha = 0; linha < jogos.length; linha++) {
            System.out.print((linha + 1) + "o jogo ==> ");
            System.out.println(Arrays.toString(jogos[linha]));
        }
//        System.out.println(Arrays.deepToString(jogos));

        /**
         * Sortear os números da mega sena.
         */
        int[] sorteados = new int[6];
        for (int i = 0; i < 6; i++) {
            int sorteado = r.nextInt(60);
            while (sorteado <= 0) {
                sorteado = r.nextInt(60);
            }
            sorteados[i] = sorteado;
        }

        System.out.println("***||mostra os números sorteados||***");
        System.out.println("Números sorteados: " + Arrays.toString(sorteados));

        /**
         * Verificar se o usuário ganhou na mega sena(acertou os 6 números)
         */
        int[][] acertos = new int[quantidade][numeros];
        for (int i = 0; i < sorteados.length; i++) {
            for (int j = 0; j < jogos.length; j++) {
                for (int k = 0; k < 6; k++) {
                    int numeroJogado = jogos[j][k];
                    if (sorteados[i] == numeroJogado) {
                        acertos[j][k] = numeroJogado;
                    }
                }
            }
        }
        /**
         * Mostra os acertos
         */
        System.out.println("***||imprime os acertos para cada jogo||***");
        for (int i = 0; i < acertos.length; i++) {
            System.out.println("Acertos no " + (i + 1) + "o jogo ==> " + (Arrays.toString(acertos[i])));
        }
    }

}
