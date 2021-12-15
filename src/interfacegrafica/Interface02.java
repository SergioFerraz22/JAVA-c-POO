package interfacegrafica;

import javax.swing.JOptionPane;

public class Interface02 {
	
	public static void main(String args[]){
	
		String n1, n2;
		int num1,num2,soma;
		//converte o primeiro número digitado pelo usuario como Uma String
		n1= JOptionPane.showInputDialog("Entre com o primeiro número:");
		
		//n1=JOpitonPane.showInputDialog(null,"Entre com o primeiro núemro:","Entrado de Dados",
		 //JoptionPane.WARNING_MESSAGE);
		
		//converte o segundo número digitado pelo usuário como uma String
		
		n2=JOptionPane.showInputDialog("Entre com o segundo número:");
		
		//converte os numeros String para inteiro
		
		num1 = Integer.parseInt(n1);
		num2 = Integer.parseInt(n2);
		
		soma = num1+num2;
		
		JOptionPane.showMessageDialog(null"A soma é",+soma,"Resultado",JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
				
	}
	
	

}
