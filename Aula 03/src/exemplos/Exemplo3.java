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
        //Pode ser utilizado long para o cpf. Não pode utilizar int pois o número é muito grande
        //Tamanho máximo do int é 2147483647
        int cpf;
        double salario;
//        System.out.println(Integer.MAX_VALUE);

        //capptura o que e digitado
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
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
