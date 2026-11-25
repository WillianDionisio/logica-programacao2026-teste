import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Olá, " + nome + " seja bem-vindo(a)!");
        ler.close();
    }

}
