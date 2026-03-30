import java.util.Random;

public class Exercicio05 {
    static void main() {
        Random rand = new Random();

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        int p = 0, im = 0;

        for (int i = 0; i < 20; i++) {
            numeros[i] = rand.nextInt(100);
        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                pares[p++] = numeros[i];
            } else {
                impares[im++] = numeros[i];
            }
        }

        System.out.println("Pares:");
        for (int i = 0; i < p; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nÍmpares:");
        for (int i = 0; i < im; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
