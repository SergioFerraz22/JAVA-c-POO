package conta;

public interface Conta {
        
        public void depositar(double quantia);
        public void sacar(double quantia);
        public double getSaldo();
}