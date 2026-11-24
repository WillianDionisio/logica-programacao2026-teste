public class Exercicio4 {
    public static void main(String[] args) {
        String diasSemana[] = new String[7];
        diasSemana[0] = "Domingo"; diasSemana[1] = "Segunda-feira"; diasSemana[2] = "Terça-feira";
        diasSemana[3] = "Quarta-feira"; diasSemana[4] = "Quinta-feira"; diasSemana[5] = "Sexta-feira";
        diasSemana[6] = "Sábado"; 
        double acimaMedia = 0; double diasMaisQuentes = 0; double media = 0;
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("Digite a temperatura de " + diasSemana[i] + ": ");
        }
    }

}
