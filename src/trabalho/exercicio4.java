package trabalho;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String args[]) {
		double PI = 3.0;
		int nila = 2;
		int kan = 3;
		int tha = 4;
        	
		System.out.println("Precisão das casas decimais (apenas inteiros positivos): ");
		Scanner sc = new Scanner(System.in);
		int repetir = sc.nextInt();

		for(int i=1;i<=repetir;i++) {
			if(i%2!=0) {
				PI += 4.0/(nila*kan*tha);
			}else {
				PI -= 4.0/(nila*kan*tha);
			}
			nila += 2;
			kan += 2;
			tha += 2;
		}
		System.out.println("p vale: "+ PI);
	}
	

}
