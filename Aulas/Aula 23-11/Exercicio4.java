  import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        String[] diasSemana = {
            "Domingo", "Segunda", "Terça",
            "Quarta", "Quinta", "Sexta", "Sábado"
        };
        double[] temperaturas = new double[7];
        Scanner ler = new Scanner(System.in);

        double soma = 0;

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.print("Digite a temperatura de " + diasSemana[i] + ": ");
            temperaturas[i] = ler.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;
        int indiceMaisQuente = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[indiceMaisQuente]) {
                indiceMaisQuente = i;
            }
        }

        System.out.printf(ptBr, "Média da semana: %.1f °C%n", media);
        System.out.println("Dias acima da média:");

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf(ptBr, "%s (%.1f °C)%n", diasSemana[i], temperaturas[i]);
            }
        }

        System.out.printf(
            ptBr,
            "Dia mais quente: %s (%.1f °C)%n",
            diasSemana[indiceMaisQuente],
            temperaturas[indiceMaisQuente]
        );

        ler.close();
    }
}