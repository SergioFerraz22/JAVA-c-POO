// Classe Principal
public class Principal{
  public static void main(String argv[]){
    int script = 6, atuacao = 9, direcao = 8;
 
      System.out.print("A pontuação de um filme é ");
      System.out.println(Filme.pontuarFilme(script,atuacao, direcao));
  
      System.out.print("A pontuação do filme do James Bond é ");
   System.out.println(JamesBondFilme.pontuarFilme(script, atuacao, direcao));
  }
}