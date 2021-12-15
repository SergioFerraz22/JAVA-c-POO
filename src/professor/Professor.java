package professor;

public abstract class Professor {
        
        //atributos
        private String nome, matricula;
        private int idade;
        private int desconto;

        //getters e setters
        public void setNome(String nome) {
                this.nome = nome;
        }
        public String getNome() { 
                return nome; 
        }
        
        public void setMatricula(String matricula) {
                this.matricula = matricula;
        }
        public String getMatricula() { 
                return matricula; 
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }
        public int getIdade() {
                return idade; 
        }

        public void setDesconto(int desconto) {
                this.desconto = desconto;
        }
        public int getDesconto() { 
                return desconto; 
        }
        
        //método abstrato
        public abstract double calculaSalario();
}//fim classe