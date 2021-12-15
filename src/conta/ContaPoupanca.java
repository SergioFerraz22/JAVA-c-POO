package conta;

public class ContaPoupanca {
        
        public static void main(String args[ ]) {
                
                ContaCorrente contaCorrente = new ContaCorrente();
                contaCorrente.depositar(2500.78);
                contaCorrente.sacar(250);
                System.out.println("\nSaldo da Conta corrente: "+contaCorrente.getSaldo());
                
                ContaPoupanca contaPoupanca = new ContaPoupanca();
                contaPoupanca.depositar(5000.50);
                contaPoupanca.sacar(445);
                System.out.println("\nSaldo da Conta Poupança: "+contaPoupanca.getSaldo());
                
                System.out.println("\nSaldo da Conta corrente: "+contaCorrente.getSaldo());
                System.out.println("\nSaldo da Conta Poupança: "+contaPoupanca.getSaldo());
                
        } // fim do main
}//fim classe