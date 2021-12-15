package colecao;

public class Wrapper1 {
	public static void main(String args[]) {
		//tipo de dado byte
		byte a = 1;
		// wrapping para um objeto Byte
		Byte byteobj=a;
		
		//tipo de dad int
		int b = 10;
		//wrapping para um objeto integer
		Integer intobj = b;
		
		// tipo de dado float
		float c = 18.6f;
		//wrapping para um objeto Float
		Float floatobj = c;
		
		//tipo de dado double
		double d = 250.5;
		//wrapping para um objeto Double
		Double doubleobj = d;
		
		//tipo de dado char
		char e ='a';
		//wrapping para um objeto Characeter
		Character charobj='e';
		
		//tipo de dado boolean
		boolean f = true;
		//wrapping para um objeto Boolean
		Boolean booleanobj=f;
		
		//exibindo os valores dos objetos
		System.out.println("\n\nValores dos objetos Wrappers (exibindo como objetos)"); 
        System.out.println("Objeto Byte byteobj:  " + byteobj.byteValue()); 
        System.out.println("Objeto Integerintobj:  " + intobj.intValue()); 
        System.out.println("Objeto Floatfloatobj:  " + floatobj.floatValue()); 
        System.out.println("Objeto Double doubleobj:  " + doubleobj.doubleValue()); 
        System.out.println("Objeto Charactercharobj:  " + charobj.charValue());
        System.out.println("Objeto Booleanbooleanobj:  " + booleanobj.booleanValue());
		
		//recuperando os tipos de daos dos objetos
		//unrappign objetos para tipos primitivos de dados
		
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;
		boolean booleanv = booleanobj;
		
		//exibindo os valores dos tipos de dados 
		System.out.println("\n\nValores Unwrapped(exibindo com otipo de dados)");
		System.out.println("byte valor, bv.:" +bv);
		System.out.println("int valor, iv." +iv);
		System.out.println("float valor, fv."+fv);
		System.out.println("double valor, dv."+dv);
		System.out.println("char valor, cv." +cv);
		System.out.println("boolean valor, boolean. +booleanv");
	}

}
