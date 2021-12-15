package interfacegrafica;
import javax.swing.*; 
import java.awt.*;
public class Exercicio051 {
	public static void main(String args[ ]) { 
        JFrame janela = new JFrame(); 
        JPanel painel =  new JPanel();
        janela.add(painel);
        painel.setLayout(new GridLayout(2, 3));  //2 linhas e 3 colunas
        painel.add(new JButton("Botão 1")); 
        painel.add(new JTextField("TEXTO 1")); 
        painel.add(new JButton("Botão 2")); 
        painel.add(new JTextField("TEXTO 2")); 
        painel.add(new JButton("Botão 3")); 
        janela.pack(); // dimensiona para o tamanho da janela. Não foi utilizado setSize().
        janela.setLocation(500,300); // colunas e linhas
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // fim main
 } // fim classe

