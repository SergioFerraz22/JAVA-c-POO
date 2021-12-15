package dadospessoais;

public class RegistroFornecedor extends DadosPessoais {

           //atributos
           private int cnpj;
           private int limiteVenda;
           private String formaPagamento;
           private String inscricaoEstadual;
           private String representanteComercial;
           
           //construtor
           public RegistroFornecedor(String nome, String endereco, String bairro, String cidade, String estado, int telefone, String cep, int cnpj, 
                           int limiteVenda, String formaPagamento, String inscricaoEstadual, String representanteComercial){

                           super(nome, endereco, bairro, cidade, estado, cep, telefone);

                           setCnpj(cnpj);
                           setLimiteVenda(limiteVenda);
                           setFormaPagamento(formaPagamento);
                           setInscricaoEstadual(inscricaoEstadual);
                           setRepresentanteComercial(representanteComercial);
                   }

           //Getter e Setters
           //cnpj
           public int getCnpj(){
                           return cnpj;
           }
           public void setCnpj(int cnpj){
                           this.cnpj = cnpj;
           }
           
           //limiteVenda
           public int getLimiteVenda(){
                           return limiteVenda;
           }
           public void setLimiteVenda(int limiteVenda){
                           this.limiteVenda = limiteVenda;
           }
           
           //formaPagamento
           public String getFormaPagamento(){
                      return formaPagamento;
           }
           public void setFormaPagamento(String formaPagamento){
                           this.formaPagamento = formaPagamento;
           }
           
           //inscricaoEstadual
           public String getInscricaoEstadual(){
                   return inscricaoEstadual;
           }
           public void setInscricaoEstadual(String inscricaoEstadual){
                           this.inscricaoEstadual = inscricaoEstadual;
           }
           
           //representanteComercial
           public String getRepresentanteComercial(){
                       return representanteComercial;
                   
           }
           public void setRepresentanteComercial(String representanteComercial){
                   this.representanteComercial = representanteComercial;
           }
           
        }//fim classe