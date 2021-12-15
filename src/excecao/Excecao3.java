package excecao;
import java.util.Scanner;

public class Excecao3 {
        
        public static void main(String args[ ]) {
                
                float val1,val2,result;
                Scanner sc = new Scanner(System.in);
                
                try {
                                   System.out.print("Entre com o primeiro valor: ");
                val1 = sc.nextFloat();
                 System.out.print("Entre com o segundo valor: ");
                 val2 = sc.nextFloat();
                 if (val2==0)
                                 throw (new ArithmeticException());
                 result = val1 / val2;
                 System.out.println(val1 + " / " + val2 + " = " + result);
                } // fim do try
        catch (ArithmeticException arithmeticException){
                 System.out.printf("\nExce��o: %s\n",arithmeticException);
                 System.out.println("Divis�o por zero! Tente novamente"); 
       } // fim de catch
        sc.close();
        }// fim do main
}// fim da classe