package exemplos;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.printf("Sua idade é: " + idade + "\n");

    }

}
