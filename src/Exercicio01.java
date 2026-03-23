public class Exercicio01 {
    static void main() {
        //1 - Ler dois vetores, A e B com um número variável de conteúdo (números)
        // (no máximo 10). O programa deve solicitar antes da leitura dos vetores
        // a quantidade de dados a serem lidos (1 a 10), os dois vetores terão o mesmo
        // número de elementos. Gerar um terceiro vetor chamado Soma (de no máximo
        // 10 elementos) que seja a soma dos dados do vetor A com os do vetor B.

        int Resp = Integer.parseInt(IO.readln("Digite a quantidade de dados (1 a 10): "));

        int[] vetorA = new int[Resp];
        int[] vetorB = new int[Resp];
        int[] soma = new int[Resp];

        for (int i = 0; i < Resp; i++) {
            vetorA[i] = Integer.parseInt(IO.readln("Digite um numero para A: "));
        }

        for (int i = 0; i < Resp; i++) {
            vetorB[i] = Integer.parseInt(IO.readln("Digite um numero para B: "));
        }

        for (int i = 0; i < Resp; i++) {
            soma[i] = vetorA[i] + vetorB[i];
            IO.println("A soma na posicao " + i + " eh: " + soma[i]);
        }

        
    }
}
