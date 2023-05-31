import java.util.Scanner;

public class Lista5Exercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.println("\nDigite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        double mediaAritimetica = MediaAritimetica(numeroUm, numeroDois);

        System.out.println("\nO valor da média aritmetica é: " + mediaAritimetica);
        scanner.close();
       
    }

    public static double MediaAritimetica(double numeroUm, double numeroDois) {
        double media = (numeroUm + numeroDois) / 2;
        return media;
    }
}