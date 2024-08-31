package ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];
        double soma = 0;

        // Leitura dos 5 valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        // Cálculo da média
        double media = soma / 5;
        System.out.println("\nValores digitados:");
        for (double valor : valores) {
            System.out.println(valor);
        }

        // Mostrando a média
        System.out.println("\nMédia Aritmética: " + media);

        scanner.close();

    }
}
