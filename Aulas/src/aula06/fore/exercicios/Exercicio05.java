/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.fore.exercicios;

/**
 * Calcular juros compostos
 *
 * @author fabricio
 */
public class Exercicio05 {

    public static void main(String[] args) {
        double principal = 1000;
        double taxa = 0.05;
        int anos = 10;
        //pow: 10 elevado a 2
//        System.out.println(Math.pow(10, 2));
        for (int anoCorrente = 1; anoCorrente <= anos; anoCorrente++) {
            double saldo = principal * Math.pow(1 + taxa, anoCorrente);
            System.out.println("Saldo no ano " + anoCorrente + " foi de: " + saldo);
        }

    }
}
