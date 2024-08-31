package ex2;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ex2 {
    public static void main(String[] args) {
        String inputRaio = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");

        double raio = Double.parseDouble(inputRaio);

        double area = Math.PI * Math.pow(raio, 2);

        DecimalFormat df = new DecimalFormat("#.####");
        String areaFormatada = df.format(area);

        JOptionPane.showMessageDialog(null, "A área do círculo é: " + areaFormatada);
    }
}
