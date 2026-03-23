import java.util.Random;

public class Exemplo03_Hand_Vetor {
    static void main() {
        Random aleatorio = new Random();
        //Gerando um numero aleatorio
        int numero = aleatorio.nextInt();
        IO.println("O numero inteiro gerado foi "+numero);
        //posso usar com um limite superior
        numero = aleatorio.nextInt(100);
        IO.println("O numero inteiro gerado entre 0 e 100 foi "+numero);
        //posso usar com um limite superior e inferior
        numero = aleatorio.nextInt(-10, 10);
        IO.println("O numero inteiro gerado entre -10 e 10 foi "+numero);
        //boleano aleatorio
        boolean sorteio = aleatorio.nextBoolean();
        IO.println("O valor boleano aleatorio foi "+sorteio);
        //teste?valor_verdadeiro:valor_falso
        IO.println("Cara ou Coroa "+(sorteio?"Cara":"Coroa"));

    }
}
