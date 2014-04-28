package exercicios;

public class Exercicio7 {

    public static void main(String[] args) {
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            } else {
                somaImpar += i;
            }
        }
        System.out.println("Pares: " + somaPar);
        System.out.println("Ímpares: " + somaImpar);
    }
}
