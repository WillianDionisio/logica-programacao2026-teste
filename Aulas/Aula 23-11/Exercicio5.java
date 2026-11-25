import java.util.Scanner;
public class Exercicio5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.next();
        }

        System.out.print("Buscar qual nome? ");
        String busca = sc.next();

        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                System.out.println("Encontrado na posição " + (i + 1));
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println(busca + " aparece " + contador + " vez(es).");
        } else {
            System.out.println(busca + " não foi encontrado.");
        }

        sc.close();
    }
}
