/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 * Utilizando a função Scanner, criar um programa que solicite o nome, o salário
 * bruto, a porcentagem de inss, a porcentagem de FGTS. Com estas informações
 * calcular o valor do inss a descontar, o valor do FGTS e o salário líquido do
 * funcionário. Imprimir o nome, salário bruto, inss, fgts e salário líquido.
 *
 * Funcionário	Salário Bruto	INSS(-)	FGTS	Bonificação(+)	SalárioLíquido Fulano
 * Fulano       1000.0          80.0	80.0	150.0           1070.0
 *
 * @author fabricio
 */
public class Exercicio3 {

    public static void main(String[] args) {
        String nomeFuncionario;
        double salarioBruto;
        double salarioLiquido;
        double porcentagemInss;
        double porcentagemFgts;
        double valorInss;
        double valorFgts;
        double valorBonificacao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        nomeFuncionario = entrada.next();
        System.out.print("Informe o salário bruto do funcionário " + nomeFuncionario + ": ");
        salarioBruto = entrada.nextDouble();
        System.out.print("Informe a porcentagem de INSS: ");
        porcentagemInss = entrada.nextDouble();
        System.out.print("Informe a porcentagem de FGTS: ");
        porcentagemFgts = entrada.nextDouble();
        System.out.print("Informe o valor da bonificação: ");
        valorBonificacao = entrada.nextDouble();

        //Calcula o inss devido e fgts
        valorInss = salarioBruto * (porcentagemInss / 100);
        valorFgts = salarioBruto * (porcentagemFgts / 100);

        //Calcula o salário líquido
        salarioLiquido = salarioBruto - valorInss + valorBonificacao;

        System.out.println();
        System.out.println("Funcionário\tSalário Bruto\tINSS(-)\tFGTS\tBonificação(+)\tSalárioLíquido");
        System.out.println(nomeFuncionario + "\t\t" + salarioBruto + "\t\t" + valorInss + "\t" + valorFgts + "\t" + valorBonificacao + "\t\t" + salarioLiquido);

    }
}
