import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        double notas[] = new double[5];
        double mediaTurma = 0; int aprovados = 0; int reprovados = 0;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = ler.nextDouble();
            mediaTurma += notas[i];
            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
            
        } 
        mediaTurma /= notas.length;
        System.out.printf("\nMédia da turma: %.2f ", mediaTurma);
        System.out.println("\nAprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }

}
