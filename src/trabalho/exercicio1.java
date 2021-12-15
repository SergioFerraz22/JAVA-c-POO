package trabalho;

public class exercicio1 {

	public static void main(String args[]) {
		int i = 0;
		int primeiro = 0;
		int segundo = 1;
		int f = 0;

		while(i < 15) {
			if(i <= 1) {
				f = i;
				System.out.println(" A " + (i+1) + "ª sequência Fibonacci é " + f);
			}else {
				f = primeiro+segundo;
				System.out.println(" A " + (i+1) + "ª sequência Fibonacci é " + f);
				primeiro = segundo;
				segundo = f;
			}
			i++;
		}
	}
}