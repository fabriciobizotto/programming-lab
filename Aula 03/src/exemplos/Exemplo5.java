package exemplos;

/**
 * Calcular a área de um retângulo. Alterar este programa para utilizar a classe
 * Scanner.
 *
 * @author fabricio
 */
import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {
        double base, altura, areaRetangulo;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a base: ");
        base = entrada.nextDouble();
        
        System.out.print("Informe a altura: ");
        altura = entrada.nextDouble();
        
        areaRetangulo = base * altura;

        System.out.println("A área de um retângulo que possui "
                + base + " métros de base e "
                + altura + " métros de altura é: "
                + areaRetangulo + " métros quadrados.");
    }
}
