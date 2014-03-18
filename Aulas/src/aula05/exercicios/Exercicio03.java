package aula05.exercicios;

import javax.swing.JOptionPane;

/**
 * Verificar qual é o mês do número informado.
 *
 * @author fabricio
 */
public class Exercicio03 {

    public static void main(String[] args) {
        String mensagem = null;
        String mesEntrada = JOptionPane.showInputDialog(null, "Informe o mês como número", "MÊS", JOptionPane.QUESTION_MESSAGE);

        //Converte String em Integer
        int mes = Integer.parseInt(mesEntrada);

        switch (mes) {
            case 1:
                mensagem = "Janeiro";
                break;
            case 2:
                mensagem = "Fevereiro";
                break;
            case 3:
                mensagem = "Março";
                break;
            case 4:
                mensagem = "Abril";
                break;
            case 5:
                mensagem = "Maio";
                break;
            case 6:
                mensagem = "Junho";
                break;
            case 7:
                mensagem = "Julho";
                break;
            case 8:
                mensagem = "Agosto";
                break;
            case 9:
                mensagem = "Setembro";
                break;
            case 10:
                mensagem = "Outubro";
                break;
            case 11:
                mensagem = "Novembro";
                break;
            case 12:
                mensagem = "Dezembro";
                break;
            default:
                mensagem = "Mês Inválido!";
        }

        JOptionPane.showMessageDialog(null, mensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);

    }
}
