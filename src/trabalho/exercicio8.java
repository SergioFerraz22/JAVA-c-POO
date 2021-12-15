package trabalho;
import java.util.Scanner;
public class exercicio8 {	

		public static void main(String args[]) {
			String frase;
			boolean palindromo = true;

			System.out.println("Digite a palavra:");
			Scanner sc = new Scanner(System.in);
			frase = sc.nextLine();
			int i = 0;
			int j = frase.length() - 1;

			while(i < j) {
				if(frase.charAt(i) != frase.charAt(j)){
					palindromo = false;
					break;
				}
				i++;
				j--;
			}
			if(palindromo==true) {
				System.out.println("\nA palavra "+ frase +" é um palíndromo.");
			}else {
				System.out.println("\nA palavra "+ frase +" não é um palíndromo.");
			}
		}
	}

