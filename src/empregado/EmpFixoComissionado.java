package empregado;
//Classe Empregado com sal∑rio base mais comissÑo
public class EmpFixoComissionado extends EmpComissionado{

        private double salarioBase; // atributo exclusivo
  
        // construtor da classe
        public EmpFixoComissionado(String nome, String sobreNome, String cpf, double totalVendas,
     double taxaComissao,  double salarioBase){
                
          // chama construtor da superclasse
                  super(nome,sobreNome,cpf,totalVendas,taxaComissao);
          // chamada a m»todo da pr€pria classe
          setSalarioBase(salarioBase);
        } // termino do construtor da classe

        // get e set
        public void setSalarioBase(double salarioBase){
                  this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
        }
        public double getSalarioBase() {
                  return salarioBase;
        }
        //mÈtodo
  // calcula o sal·rio
        public double salario(){
                  return getSalarioBase() + super.salario();
        }
}  // fim da classe Empregado Fixo Comissionado
