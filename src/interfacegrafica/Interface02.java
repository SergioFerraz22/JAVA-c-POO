package interfacegrafica;

import javax.swing.JOptionPane;

public class Interface02 {
	
	public static void main(String args[]){
	
		String n1, n2;
		int num1,num2,soma;
		//converte o primeiro n�mero digitado pelo usuario como Uma String
		n1= JOptionPane.showInputDialog("Entre com o primeiro n�mero:");
		
		//n1=JOpitonPane.showInputDialog(null,"Entre com o primeiro n�emro:","Entrado de Dados",
		 //JoptionPane.WARNING_MESSAGE);
		
		//converte o segundo n�mero digitado pelo usu�rio como uma String
		
		n2=JOptionPane.showInputDialog("Entre com o segundo n�mero:");
		
		//converte os numeros String para inteiro
		
		num1 = Integer.parseInt(n1);
		num2 = Integer.parseInt(n2);
		
		soma = num1+num2;
		
		JOptionPane.showMessageDialog(null"A soma �",+soma,"Resultado",JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
				
	}
	
	

}
