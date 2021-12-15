import java.util.Scanner;
public class conta {
	private String titular;
	private double saldo;
	private int conta;
	
	public conta(String titular, int conta) {
		this.titular = titular;
		this.conta = conta;
		//this.saldo = saldo;
	}

// Setters e Getters

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return(saldo);
	}

// Métodos

	void Sacar() {
		double menos,temp;
		boolean valido;
		System.out.println("\nQuanto deseja sacar?");
		do {
			Scanner sc = new Scanner(System.in);
			menos = sc.nextDouble();
			saldo -= menos;

			if(menos < 0) {
				System.out.println("\nValor de saque inválido. Tente novamente:");
				saldo += menos;
				valido = false;
			}else {
				valido = true;
			}

			if(saldo < 0 && valido == true) {
				System.out.println("\nSaldo insuficiente! Tente outro valor.");
				saldo += menos;
				valido = false;
			}
		}while(valido == false);
		System.out.println("\nSaque realizado com sucesso.");
	}
	
	void Depositar() {
		double mais;
		boolean valido;
		System.out.println("\nQuanto deseja depositar?");
		do {
			Scanner sc = new Scanner(System.in);
			mais = sc.nextDouble();
			saldo += mais;

			if(mais < 0) {
				System.out.println("\nValor de depósito inválido. Tente novamente:");
				saldo -= mais;
				valido = false;
			}else {
				valido = true;
			}
		}while(valido == false);
		System.out.println("\nDepósito realizado com sucesso.");
	}
}