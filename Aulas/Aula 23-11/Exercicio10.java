import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] vendas = new int[3][4];

        int totalGeral = 0;
        int maiorVenda = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as vendas do funcionário " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                vendas[i][j] = ler.nextInt();
                totalGeral += vendas[i][j];

                if (vendas[i][j] > maiorVenda) {
                    maiorVenda = vendas[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            int totalFuncionario = 0;
            for (int j = 0; j < 4; j++) {
                totalFuncionario += vendas[i][j];
            }
            System.out.println("Funcionário " + (i + 1) + ": " + totalFuncionario);
        }

        System.out.println("Total geral: " + totalGeral);
        System.out.println("Maior venda: " + maiorVenda);

        ler.close();
    }
}

