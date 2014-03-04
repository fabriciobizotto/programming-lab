/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * Arquivo.txt
 * <br>Fabricio|24|Videira|SC</br>
 * <br>Bruno|32|Fraiburgo|SC</br>
 *
 * @author fabricio
 */
public class LerArquivo {

    public static void main(String[] args) {
        try {
            String nome, cidade, estado, idade;

            Scanner entrada = new Scanner(new File("arquivo.txt"));
            entrada.useDelimiter("\\||\\n");
            while (entrada.hasNext()) {
                nome = entrada.next();
                idade = entrada.next();
                cidade = entrada.next();
                estado = entrada.next();
                System.out.println(nome + " tem " + idade + " anos de idade e mora em " + cidade + "(" + estado + ")");
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
