import java.util.Scanner;
public class Exercicio8 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][3];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite os elementos da linha " + i);
            for (int j = 0; j < matriz[i].length; j++) {;
                matriz[i][j] = ler.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        ler.close();
    }
}

