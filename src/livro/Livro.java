//Livro
package livro;
public class Livro {
        
        //atributos
        private String nome;
        private String autor;
        private String edicao;
        private String editora;
        private int anoPublicacao;
        
        //construtores
        Livro(){
                setNome("Desconhecido");
                setAutor("Desconhecido");
                setEdicao("Desconhecido");
                setEditora("Desconhecido");
                setAnoPublicacao(0);
        }
        
        Livro(String nome, String autor, String edicao, String editora, int anoPublicacao){
                setNome(nome);
                setAutor(autor);
                setEdicao(edicao);
                setEditora(editora);
                setAnoPublicacao(anoPublicacao);
        }
        
        //getters and setters
        //nome
        public String getNome(){
                return nome;
        }
        public void setNome(String nome){
                this.nome = nome;
        }
        
        //autor
        public String getAutor(){
                return autor;
        }
        public void setAutor(String autor){
                this.autor = autor;
        }
        
        //edicao
        public String getEdicao(){
                return edicao;
        }
        public void setEdicao(String edicao){
                this.edicao = edicao;
        }
        
        //editora
        public String getEditora(){
                return editora;
        }
        public void setEditora(String editora){
                this.editora = editora;
        }
        
        //anoPublicacao
        public int getAnoPublicacao(){
                return anoPublicacao;
        }
        public void setAnoPublicacao(int anoPublicacao){
                this.anoPublicacao = anoPublicacao;
        }
        
        //métodos
        public void exibeAtributos(){
                System.out.println("O nome do livro é "+getNome());
                System.out.println("O autor do livro é "+getAutor());
                System.out.println("A edicao do livro é "+getEdicao());
                System.out.println("A editora é "+getEditora());
                System.out.println("Foi publicado em "+getAnoPublicacao());
        }
}//fim Livro
