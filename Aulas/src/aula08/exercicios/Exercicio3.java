package exercicios;

public class Exercicio3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Torta de Laranja");
            } else if (i % 5 == 0) {
                System.out.println("Laranja");
            } else if (i % 3 == 0) {
                System.out.println("Torta");
            } else {
                System.out.println(i);
            }
        }
    }
}
