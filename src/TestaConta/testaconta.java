package TestaConta;
import java.util.Scanner;
public class testaconta {

	public static void main(String args[]) {
		Scanner sc1 = new Scanner(System.in);
			System.out.println("\nDigite o titular da conta: ");
			String nome = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
			System.out.println("\nDigite o Nº da conta: ");
			int corrente = sc2.nextInt();

			conta usuario = new conta(nome,corrente);

		Scanner sc3 = new Scanner(System.in);
			System.out.println("\nDigite o saldo da conta: ");
			usuario.setSaldo(sc3.nextDouble());

		Scanner entrada = new Scanner(System.in);
        
			System.out.println("\nEscolha sua operação: \n1 - Sacar\n2 - Depositar\n");
			int operacao = entrada.nextLine().charAt(0);
			
		switch(operacao) {
			case '1':
				usuario.Sacar();
				System.out.println("Saldo da conta: "+ usuario.getSaldo());
				break;        
			case '2':
				usuario.Depositar();
				System.out.println("Saldo da conta: "+ usuario.getSaldo());
				break;
			default:
				System.out.println("Você digitou uma operação inválida.");        
            
        	}
	}
}