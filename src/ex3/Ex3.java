package ex3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double valorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        DecimalFormat df = new DecimalFormat("#.00");
        String salarioFormatado = df.format(salario);

        System.out.println("O salário do funcionário é: R$ " + salarioFormatado);

        scanner.close();
    }
}
