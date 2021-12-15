package carro;
public class UsaCarro{
        
        public static void main (String args[ ]) {
                
                  Carro meuCarro = new Carro(); // instancia o objeto
                  //meuCarro.marca = "Palio"; // inicia o atributo marca
                  //meuCarro.cor = "azul";    // inicia o atributo cor
                  System.out.println("Mostrando os atributos:");
                  meuCarro.mostraAtributos(); //mensagem para o objeto
                  
                  Carro outroCarro = new Carro("Gol", "prata");
                  System.out.println("---------");
                  System.out.println("Mostrando os atributos:");
                  outroCarro.mostraAtributos(); //mensagem para o objeto
                  
                  Carro terceiroCarro = new Carro("Porsche","amarelo",false,2000);
                  System.out.println("---------");
                  System.out.println("Mostrando os atributos:");
                  terceiroCarro.mostraAtributos(); //mensagem para o objeto
                  
                  /*
                  System.out.println("---------");
                  System.out.println("Ligando o motor...");
                  meuCarro.ligaMotor(); //mensagem para ligar o carro
                  System.out.println("Mostrando os atributos:");
                  meuCarro.mostraAtributos();
                  
                  System.out.println("---------");
                  System.out.println("Desligando o motor...");
                  meuCarro.desligaMotor();
                  System.out.println("Mostrando os atributos:");
                  meuCarro.mostraAtributos();
                  */
        }// fim do main
        
} // fim da classe