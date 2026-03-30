import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        Scanner ler = new Scanner(System.in);

        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;
        int count = 0;

        for (double nota : notas) {
            if (nota > media) {
                count++;
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Acima da media: " + count);
    }
}
