/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.leituraArquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * Leitura de um arquivo que contém uma relação de preços. O arquivo deve ser
 * lido e colocado em um array bidimensional.
 *
 * @author fabricio
 */
public class LerArquivoArray2 {

    public static void main(String[] args) {
        try {
            LerArquivoArray2 lerArquivo2 = new LerArquivoArray2();
            File arquivo = new File("/home/fabricio/lista_precos.txt");
            String line, codigo, descricao, valorTexto;
            double valor = 0;
            int lin = 0;
            int totalLinhas = lerArquivo2.getTotalLinhas(arquivo);

            Scanner entrada = new Scanner(arquivo);
            String[][] lista = new String[totalLinhas][3];
            while (entrada.hasNext()) {
                line = entrada.nextLine();
                codigo = line.substring(0, 6);
                descricao = line.substring(6, 57).trim();
                valorTexto = line.substring(66);

                //Verifica se existe mais que um ponto no texto. 
                int charCount = valorTexto.replaceAll("[^.]", "").length();
                //Se sim então remove o primeiro ponto.
                if (charCount > 1) {
                    valorTexto = valorTexto.replaceFirst("\\.", "");
                }
                valor = Double.parseDouble(valorTexto);
                //insere as informações dentro do array, linha e coluna
                lista[lin][0] = codigo;
                lista[lin][1] = descricao;
                lista[lin++][2] = valor + "";
            }
            for (int linha = 0; linha < lista.length; linha++) {
                for (int j = 0; j < lista[linha].length; j++) {
                    System.out.print(lista[linha][j] + "|");
                }
                System.out.println();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        }
    }

    public int getTotalLinhas(File arquivo) throws FileNotFoundException {
        Scanner entrada = new Scanner(arquivo);
//      entrada.useDelimiter("\\||\\n");
        int totalLinhas = 0;
        //Verifica o total de linhas do arquivo
        while (entrada.hasNextLine()) {
            totalLinhas++;
            entrada.nextLine();
        }
        entrada.close();
        return totalLinhas;
    }
}
