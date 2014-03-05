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
 * lido e colocado em um array.
 *
 * @author fabricio
 */
public class LerArquivoArray1 {

    public static void main(String[] args) {
        try {
            LerArquivoArray1 lerArquivo2 = new LerArquivoArray1();
            File arquivo = new File("/home/fabricio/lista_precos.txt");
            String linha, codigo, descricao, valorTexto;
            double valor = 0;
            int cont = 0;
            int totalLinhas = lerArquivo2.getTotalLinhas(arquivo);

            Scanner entrada = new Scanner(arquivo);
            String[] lista = new String[totalLinhas];
            //Percorre o arquivo enquanto tiver linhas para percorrer
            while (entrada.hasNextLine()) {
                linha = entrada.nextLine();
                codigo = linha.substring(0, 6);
                descricao = linha.substring(6, 57).trim();
                valorTexto = linha.substring(66);

                //Verifica se existe mais que um ponto no texto. 
                int charCount = valorTexto.replaceAll("[^.]", "").length();
                //Se sim então remove o primeiro ponto.
                if (charCount > 1) {
                    valorTexto = valorTexto.replaceFirst("\\.", "");
                }
                //converte a String em double
                valor = Double.parseDouble(valorTexto);
                lista[cont++] = codigo + " - " + descricao + " - " + valor;
            }
            //Percorre o array e imprime os valores
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
            //fecha o scanner
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
