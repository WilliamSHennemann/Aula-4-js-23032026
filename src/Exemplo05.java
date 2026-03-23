public class Exemplo05 {
    static void main() {
        //Preciso armazenar uma quantidade desconhecida de numeros
        int[] vetor = new int[1000];
        int i=0;
        int resp;
        do {
            IO.print("Informe o "+(i+1)+"° numero");
            vetor[i] = Integer.parseInt(IO.readln());
            resp = Integer.parseInt(IO.readln());
        }while (resp == 1);
    }
}
