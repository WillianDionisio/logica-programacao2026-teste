import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int par = 0; int impar = 0; int soma = 0;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = ler.nextInt();
            soma += numeros[i];
            if (numeros[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            
        }
        System.out.println("Números digitados: ");
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[j] + " ");
            }
            System.out.println();
            System.out.println("Soma dos números: " + soma);
            System.out.println("Números pares: " + par);
            System.out.println("Números ímpares: " + impar);
    }

}
