package interfacegrafica;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Exercicio05 {
	static void criaBotaoDigito(Container c, int i){
        c.add(new JButton(i+" "));
   }

   public static void main(String[ ] args) {
           
       JFrame janela = new JFrame();
       JPanel painel = new JPanel(); 
       
       janela.add(painel);
       painel.setLayout(new GridLayout(5,3));
       
       painel.add(new JLabel("Calculadora", JLabel.CENTER));
       painel.add(new JLabel("Java  ", JLabel.RIGHT));
       //painel.add(new JLabel("Calculadora"));
       //painel.add(new JLabel("Java"));
       painel.add(new JTextField(10));
       painel.add(new JButton("+"));
       painel.add(new JButton("="));
               
       janela.setLocation(500,300);

       for (int i = 0;i<= 9;i++)
            criaBotaoDigito(painel,i);  //chama o método criaBotaoDigito

       janela.pack();
       janela.setVisible(true);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
       }


