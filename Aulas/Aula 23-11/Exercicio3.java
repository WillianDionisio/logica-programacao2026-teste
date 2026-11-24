import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        double salarios[] = new double[5];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o salário do " + (i + 1) + "º funcionário: ");
            salarios[i] = ler.nextDouble();
            if (salarios[i] < 2000) {
                salarios[i] = salarios[i] * 1.10;
            }else {
                salarios[i] = salarios[i] * 1;
            }
        }
        for (int i = 0; i < salarios.length; i++) {
            System.out.printf("\nSalário do " + (i + 1) + "º funcionário: %.2f\n", salarios[i]);
        }
    }

}
