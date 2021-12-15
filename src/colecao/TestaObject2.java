package colecao;
import java.util.Stack;//Classe Pilha
public class TestaObject2 {
	public static void main (String[] args) {
		  Object objeto = "Joao Pedro";
		  System.out.println("Objeto String:     "+objeto);
		  objeto = 33;
		  System.out.println("Objeto inteiro:     "+objeto);
		  Stack pilha = new Stack();
		  pilha.push(123); //insere um elemento na pilha
		  objeto = pilha.pop(); //remove um elemento da pilha
		  System.out.println("Objeto Pilha:      "+objeto);
		  Integer valor=objeto.hashCode();
		  //para organizar os elementos dos objetos do tipo
		  System.out.println("Valor:        "+valor);
	

}
}
//SAIDA:
	//Objeto String: João Pedro
	//Objeto Inteiro: 33
	//Objeto Pilha:123
	//Valor: 123