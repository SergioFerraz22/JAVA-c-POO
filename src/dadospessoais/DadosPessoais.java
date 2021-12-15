package dadospessoais;

public class DadosPessoais {
        
        //atributos
        private String nome;
        private String endereco;
        private String bairro;
        private String cidade;
        private String estado;
        private String cep;
        private int  telefone;
        
        //construtor
        public DadosPessoais(String nome, String endereco, String bairro, String cidade, String estado, String cep, int telefone) {
                
                setNome(nome);
                setEndereco(endereco);
                setBairro(bairro);
                setCidade(cidade);
                setEstado(estado);
                setCep(cep);
                setTelefone(telefone);
        }
        
        //getters e setters
        //nome
        public String getNome() {
                return nome;
        }
        public void setNome(String nome) {
                this.nome = nome;
        }
        
        //endereco
        public String getEndereco() {
                return endereco;
        }
        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }
        
        //bairro
        public String getBairro(){
            return bairro;
    }
    public void setBairro(String bairro){
            this.bairro = bairro;
    }

    //cidade
    public String getCidade(){
            return cidade;
    }
    public void setCidade(String cidade){
            this.cidade = cidade;
    }
    
    //estado
    public String getEstado() {
            return estado;
    }
    public void setEstado(String estado) {
            this.estado = estado;
    }

    //telefone
    public int getTelefone(){
            return telefone;
    }
    public void setTelefone(int telefone){
            this.telefone = telefone;
    }

    //cep
    public String getCep(){
            return cep;
    }
    public void setCep(String cep){
            this.cep = cep;
    }

}//fim da classe