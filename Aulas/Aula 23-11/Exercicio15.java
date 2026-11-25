import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota1, nota2;
        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextInt();
        double media = (nota1 + nota2) / 2.0;
        System.out.println("A média é: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno em recuperação!");
        }
        ler.close();
    }
}
