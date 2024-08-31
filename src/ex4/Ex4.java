package ex4;
import javax.swing.JOptionPane;
import java.time.Year;

public class Ex4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");

        String inputAnoNascimento = JOptionPane.showInputDialog("Digite o seu ano de nascimento:");

        int anoNascimento = Integer.parseInt(inputAnoNascimento);

        int anoAtual = Year.now().getValue();

        int idade = anoAtual - anoNascimento;

        String mensagem = "Você se chama " + nome + " e tem " + idade + " anos de idade!";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
