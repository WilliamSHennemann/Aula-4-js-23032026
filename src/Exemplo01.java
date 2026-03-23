public class Exemplo01 {
    static void main() {

        String valor = IO.readln("Digite um numero");
        //Como converter uma string para int
        int numero = Integer.parseInt(valor);
        //Lendo uma string e convertendo para inteiro diretamente
        numero = Integer.parseInt(IO.readln("Digite um numero"));
        //Lendo uma string e convertendo para float(lembre de digitar com ponto e não ,)
        float numeroReal = Float.parseFloat(IO.readln("Digite um numero"));
    }
}
