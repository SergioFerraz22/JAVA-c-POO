package interfacegrafica;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Exercicio04 {
	   public static void main(String[] args) {
	        
		      JFrame janela = new JFrame("Conversao de temperatura");
		      JPanel painel = new JPanel();

		      janela.add(painel);
		      painel.setLayout(new FlowLayout());

		      painel.add(new JLabel("Temp. em Celsius: "));
		      painel.add( new JTextField(5));
		      painel.add( new JButton("Converter >>>"));
		      painel.add(new JLabel("Temp. em Fahrenheit: "));
		      painel.add( new JTextField(5));

		      janela.setSize(800,100);  //especifica a largura e a altura
		      janela.setVisible(true);
		      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }
		}

