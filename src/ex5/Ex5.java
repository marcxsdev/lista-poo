package ex5;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o valor do desconto (em %): ");
        double descontoPercentual = scanner.nextDouble();

        double valorDesconto = valorProduto * (descontoPercentual / 100);
        double valorComDesconto = valorProduto - valorDesconto;

        DecimalFormat df = new DecimalFormat("#.000");

        System.out.println("\nNome do Produto: " + nomeProduto);
        System.out.println("Valor original: R$ " + df.format(valorProduto));
        System.out.println("Valor com desconto: R$ " + df.format(valorComDesconto));

        scanner.close();
    }
}
