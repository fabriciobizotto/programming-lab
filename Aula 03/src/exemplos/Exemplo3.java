package exemplos;

import java.util.Scanner;

/**
 * Mostrar porque não pode utilizar o tipo int para o cpf.
 *
 * @author fabricio
 */
public class Exemplo3 {

    public static void main(String[] args) {
        String nome;
        long cpf;
        double salario;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite seu cpf: ");
        cpf = entrada.nextLong();
        System.out.print("Digite seu salario: ");
        salario = entrada.nextDouble();

        String resultado = "Seu nome e: " + nome
                + ", seu cpf e: " + cpf
                + " e seu salario e: " + salario + " reais.";

        System.out.print(resultado + "\n");

    }

}
