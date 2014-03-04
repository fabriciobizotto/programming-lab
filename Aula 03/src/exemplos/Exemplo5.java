/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

/**
 * Calcular a área de um retângulo. Alterar este programa para utilizar a classe
 * Scanner.
 *
 * @author fabricio
 */
public class Exemplo5 {

    public static void main(String[] args) {
        double base, altura, areaRetangulo;

        base = 10.34;
        altura = 20;
        areaRetangulo = base * altura;

        System.out.println("A área de um retângulo que possui "
                + base + " métros de base e "
                + altura + " métros de altura é: "
                + areaRetangulo + " métros quadrados.");
    }
}
