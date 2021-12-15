package trabalho;

public class exercicio5 {
	public static void main(String args[]) {
		int i = 0;
		int perfeito = 1;
		int soma;

		while(i < 4) {
			soma = 0;
			for(int j=1;j<=perfeito/2;j++) {
				if(perfeito%j== 0) {
					soma += j;
				}
			}
			if(soma == perfeito) {
				System.out.println((i+1) +"º número perfeito é: "+ soma);
				i++;
			}
			perfeito++;
		}
	}
}


