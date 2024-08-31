package ex6;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ex6 {
    public static void main(String[] args) {
        String inputSalario = JOptionPane.showInputDialog("Digite o salário do funcionário:");

        double salario = Double.parseDouble(inputSalario);

        double salarioReajustado = salario + (salario * 0.15);

        DecimalFormat df = new DecimalFormat("#.00");

        String mensagem = "Antigo salário: R$ " + df.format(salario) + "\n"
                + "Salário reajustado: R$ " + df.format(salarioReajustado);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
