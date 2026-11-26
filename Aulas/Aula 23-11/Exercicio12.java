import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite os elementos da linha " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < 4; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][3 - i];
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        ler.close();
    }
}

