public class Exercicio02 {
    static void main() {
        //Declarar um vetor de até 100 números inteiros positivos, pedir para o usuário digitar
        // elementos para o vetor, até que ele digite um 0 ou que o vetor esteja cheio, que encerra
        // a leitura. Mostrar o vetor lido.

        int[] vetor = new int[100];
        int i = 0;
        int valor;

        do {
            IO.print("Informe o " + (i + 1) + "° numero (ou 0 para sair): ");
            valor = Integer.parseInt(IO.readln());

            if (valor != 0) {
                vetor[i] = valor;
                i++;
            }

        } while (valor != 0 && i < 100);

        IO.println("\n--- Vetor Lido ---");
        for (int j = 0; j < i; j++) {
            IO.println("Posição " + j + ": " + vetor[j]);
        }
    }
}
