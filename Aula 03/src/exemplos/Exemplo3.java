package exemplos;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class Exemplo3 {

    public static void main(String[] args) {
        String nome;
        int cpf;
        double salario;
        
        //capptura o que e digitado
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = entrada.next();
        System.out.print("Digite seu cpf: ");
        cpf = entrada.nextInt();
        System.out.print("Digite seu salario: ");
        salario = entrada.nextDouble();

        String resultado = "Seu nome e: " + nome
                + ", seu cpf e: " + cpf
                + " e seu salario e: " + salario + " reais.";

        System.out.printf(resultado + "\n");

    }

}
