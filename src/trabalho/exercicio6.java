package trabalho;

public class exercicio6 {
	public static void main(String args[]) {
		String frase = "Os nomes das classes em Java precisam come�ar com uma letra e depois desta quaisquer combina��es de letras e d�gitos. Como padr�o, os nomes s�o substantivos que iniciam com uma letra mai�scula. Para as constantes � costume utilizar sempre letras mai�sculas nos nomes.";

		int a = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			char posicao = frase.charAt(i);
			if(posicao == 'a') {
				a += 1;
			}
		}
		System.out.println(frase);
		System.out.println("\nA frase acima possui " + a + " ocorr�ncias da letra 'a'.");
	}

}
