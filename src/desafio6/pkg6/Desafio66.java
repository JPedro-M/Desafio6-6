package desafio6.pkg6;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio66 {
    public static void main(String[] args) {
        String nome, resultado;
        int vezes;
        double valor, bonus;
        
        resultado = "Nome:              Bônus:\n";
        nome = "";
        bonus = 0;
        for (vezes = 1;  vezes <=2; vezes++) {
            nome = JOptionPane.showInputDialog("Digite o nome:");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de compra do ano passado:"));
            
            if (valor <= 500000) {
                bonus = valor * 0.1;
            }else {
                bonus = valor * 0.15;
            }
        resultado += ""+nome+"                    R$"+bonus+"\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }    
}
