import java.util.Scanner;

public class Exercicio03 {
    static void main() {

                Scanner ler = new Scanner(System.in);

                int[] numeros = new int[10];
                int[] inverso = new int[10];

                for (int i = 0; i < 10; i++) {
                    numeros[i] = ler.nextInt();
                }

                for (int i = 0; i < 10; i++) {
                    inverso[i] = numeros[9 - i];
                }

                for (int i : inverso) {
                    System.out.print(i + " ");


        }

    }
}
