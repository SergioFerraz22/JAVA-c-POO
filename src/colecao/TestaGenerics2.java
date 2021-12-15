package colecao;

public class TestaGenerics2 {
	  public static void main(String args[ ]) {
	  Generics2<Integer>integerObjeto = new Generics2<Integer>();
	  integerObjeto.setT(20);
	  System.out.println(integerObjeto.getT());
	  
	  Generics2<String>stringObjeto = new Generics2<String>();
	  stringObjeto.setT("incluindo uma string...");  
	  System.out.println(stringObjeto.getT());
	  }
	}