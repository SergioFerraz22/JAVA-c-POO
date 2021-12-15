package colecao;

public class TestaGenercis1Erro {
	public static void main(String args[]) {
		Generics1 stringObjeto = new Generics1();
		stringObjeto.setValor("incluindo uma String...");//ERRO!
		                     //Tipos incompativeis"
		System.out.println(stringObjeto.getValor());
	}

}
