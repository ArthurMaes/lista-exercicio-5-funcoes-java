import java.util.Scanner;

public class Lista5Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nDigite o valor do produto: ");
        double valorProd = scanner.nextDouble();

        System.out.println("\nO valor do produto com 10% acrescido: " + (valorProd + NovoValor(valorProd)));
        scanner.close();
     
    }

    public static double NovoValor(double numero1) {
            double novo = numero1 * 0.10;
            return novo;
    }
}