import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] original = new int[10];
        int[] temp = new int[10];
        int qtdUnicos = 0;

        for (int i = 0; i < original.length; i++) {
            System.out.println("Digite o valor para a posição " + (i + 1) + ": ");
            original[i] = ler.nextInt();

            boolean jaExiste = false;
            for (int j = 0; j < qtdUnicos; j++) {
                if (temp[j] == original[i]) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                temp[qtdUnicos] = original[i];
                qtdUnicos++;
            }
        }

        int[] semRepetidos = new int[qtdUnicos];
        for (int i = 0; i < qtdUnicos; i++) {
            semRepetidos[i] = temp[i];
        }

        int removidos = original.length - semRepetidos.length;

        System.out.print("Original:");
        for (int valor : original) {
            System.out.print(" " + valor);
        }
        System.out.println();

        System.out.print("Sem repetidos:");
        for (int valor : semRepetidos) {
            System.out.print(" " + valor);
        }
        System.out.println();

        System.out.println("Valores removidos: " + removidos);

        ler.close();
    }
}


