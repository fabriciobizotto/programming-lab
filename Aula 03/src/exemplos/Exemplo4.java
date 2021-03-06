package exemplos;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class Exemplo4 {

    public static void main(String[] args) {
        String nomeFuncionario;
        double salarioBruto, salarioLiquido, porcentagemInss = 8, valorInss;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        nomeFuncionario = entrada.nextLine();
        System.out.print("Informe o salário bruto do funcionário " + nomeFuncionario + ": ");
        salarioBruto = entrada.nextDouble();

        //Calcula o inss devido
        valorInss = (salarioBruto * porcentagemInss) / 100;
        //Calcula o salário líquido
        salarioLiquido = salarioBruto - valorInss;

        System.out.println();
        System.out.println("Funcionário\tSalário Bruto\tINSS(-)\tSalárioLíquido");
        System.out.println(nomeFuncionario + "\t\t" + salarioBruto + "\t\t" + valorInss + "\t" + salarioLiquido);

    }
}
