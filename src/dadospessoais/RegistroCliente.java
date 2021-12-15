package dadospessoais;

public class RegistroCliente extends DadosPessoais {
        
        //atributos exclusivos
        private        int cpf;
        private int limiteCredito;
        private String localTrabalho;
        private int telefoneContato;
   
    //construtor
    public RegistroCliente(String nome, String endereco, String bairro, String cidade, String estado, String cep, int telefone, int cpf, int limiteCredito, String localTrabalho, int telefoneContato){
            
                 super(nome, endereco, bairro, cidade, estado, cep, telefone);
                 
                 setCpf(cpf);
                 setLimiteCredito(limiteCredito);
                 setLocalTrabalho(localTrabalho);
                 setTelefoneContato(telefoneContato);
         }
         
    //Getters e Setters
    //cpf
        public int getCpf(){
                return cpf;
        }
    public void setCpf(int cpf){
            this.cpf = cpf ;
    }
        
        //limiteCredito
    public int getLimiteCredito(){
            return limiteCredito;
    }
    public void setLimiteCredito(int limiteCredito){
            this.limiteCredito = limiteCredito;
    }
    
    //localTrabalho
    public String getLocalTrabalho(){
            return localTrabalho;
    }
    public void setLocalTrabalho(String localTrabalho){
            this.localTrabalho = localTrabalho;
    }
    
    //telefoneContato
    public int getTelefoneContato(){
            return telefoneContato;
    }
    public void setTelefoneContato(int telefoneContato){
            this.telefoneContato = telefoneContato;
    }

}//fim classe