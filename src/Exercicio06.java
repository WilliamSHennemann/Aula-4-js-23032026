import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Scanner ler = new Scanner(System.in);

        String[] nomes = {
                "Ana", "Bruno", "Carlos", "Daniela", "Eduardo",
                "Fernanda", "Gabriel", "Helena", "Igor", "Juliana"
        };

        for (int i = 0; i < 10; i++) {
            nomes[i] = ler.nextLine();
        }

        String busca = ler.nextLine();
        boolean achou = false;

        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(busca)) {
                achou = true;
                break;
            }
        }

        if (achou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
}
