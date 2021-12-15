package interfacegrafica;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Exercicio3 {
    public static void main(String args[ ]){
        JFrame frame         = new JFrame();
        JPanel panel         = new JPanel();
        JButton botao1       = new JButton("Meu nome");
        JButton botao2       = new JButton("Computação");
        JLabel  label        = new JLabel("Interface Gráfica");
        JTextField textfield = new JTextField("Digite aqui");
        frame.setSize(400,200);
        frame.setLocation(700,300);
        frame.setResizable(false);  // não permite que a janela seja redimensionada
        frame.add(panel); // adiciona o Panel ao Frame
        panel.add(label);  // adiciona o Label ao Panel
        panel.add(botao1); // adiciona o Botão ao Panel
        panel.add(botao2);
        panel.add(textfield);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // finaliza o programa quando a janela for fechada.
    } // fim do main                                                                 
} // fim da classe




	


