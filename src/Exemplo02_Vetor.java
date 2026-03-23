public class Exemplo02_Vetor {
    static void main() {
        //Em C int vetor[10]
        //Declaramos um vetor com indice de 0 a 9
        int[] vetor = new int[10];
        //int tamanho = sizeof(vetor)/sizeof(int)
        for (int i = 0; 1 < vetor.length; i++){
            vetor[i] = Integer.parseInt(IO.readln("Vetor {"+i+"}: "));
        }
        for (int i = 0; i < vetor.length; i++) {
            IO.print(vetor[i]+" ");
        }
        //Descobrimos o tamanho do vetor
        IO.println("\nO tamanho do vetor é "+vetor.length);
    }
}
