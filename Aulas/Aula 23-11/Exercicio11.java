import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] vendas = new int[3][4];

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor das vendas do funcionário " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                vendas[i][j] = ler.nextInt();
            }
        }

        int maiorTotal = Integer.MIN_VALUE;
        int diaMaiorTotal = 0;

        for (int j = 0; j < 4; j++) {
            int totalDia = 0;
            for (int i = 0; i < 3; i++) {
                totalDia += vendas[i][j];
            }

            System.out.println("Dia " + (j + 1) + ": " + totalDia);

            if (totalDia > maiorTotal) {
                maiorTotal = totalDia;
                diaMaiorTotal = j + 1;
            }
        }

        System.out.println("Maior total: Dia " + diaMaiorTotal + " (" + maiorTotal + ")");

        ler.close();
    }
}



