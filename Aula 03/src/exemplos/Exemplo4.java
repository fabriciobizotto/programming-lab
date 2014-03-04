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
public class Exemplo4 {

    public static void main(String[] args) {
        String nomeFuncionario;
        double salarioBruto, salarioLiquido, porcentagemInss = 0.08, valorInss;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        nomeFuncionario = entrada.nextLine();
        System.out.print("Informe o salário bruto do funcionário " + nomeFuncionario + ": ");
        salarioBruto = entrada.nextDouble();

        //Calcula o inss devido
        valorInss = salarioBruto * porcentagemInss;
        //Calcula o salário líquido
        salarioLiquido = salarioBruto - valorInss;

        System.out.println();
        System.out.println("Funcionário\tSalário Bruto\tINSS(-)\tSalárioLíquido");
        System.out.println(nomeFuncionario + "\t" + salarioBruto + "\t\t" + valorInss + "\t" + salarioLiquido);

    }
}
