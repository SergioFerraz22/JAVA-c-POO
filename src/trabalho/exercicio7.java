package trabalho;

public class exercicio7 {
	public static void main(String args[]) {
		String frase = "Exemplo de uso de métodos para Strings.";
		char posicao, nova[] = frase.toCharArray();
		
		for(int i=0; i<nova.length; i++) {
			if(i%2 == 0) {
				posicao = Character.toUpperCase(nova[i]);
				nova[i] = posicao;
			}else {
				posicao = Character.toLowerCase(nova[i]);
				nova[i] = posicao;
			}
		}
		System.out.println(nova);
	}

}
