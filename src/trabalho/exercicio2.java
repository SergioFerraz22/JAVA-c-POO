package trabalho;

public class exercicio2 {
	public static void main(String args[]) {
		int num = 1;
		boolean primo;
		
		while(num <= 100) {
			primo = false;
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					primo=true;
					break;
				}
			}
			if(!primo) {
				System.out.println(num +" é um número primo.");
	
			}
			num++;
		}
	}

}
