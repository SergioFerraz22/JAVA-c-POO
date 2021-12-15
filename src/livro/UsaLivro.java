//UsaLivro
package livro;
public class UsaLivro {
        public static void main(String args[]){
                
                Livro livro1 = new Livro();
                Livro livro2 = new Livro("Java Como Programar","Deitel","10™ Edicao","Pearson",2021);
                
                livro1.exibeAtributos();
                System.out.println("");
                livro2.exibeAtributos();
        }
}