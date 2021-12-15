package trabalho;

public class exercicio6 {
	public static void main(String args[]) {
		String frase = "Os nomes das classes em Java precisam começar com uma letra e depois desta quaisquer combinações de letras e dígitos. Como padrão, os nomes são substantivos que iniciam com uma letra maiúscula. Para as constantes é costume utilizar sempre letras maiúsculas nos nomes.";

		int a = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			char posicao = frase.charAt(i);
			if(posicao == 'a') {
				a += 1;
			}
		}
		System.out.println(frase);
		System.out.println("\nA frase acima possui " + a + " ocorrências da letra 'a'.");
	}

}
