package colecao;
import java.util.Arrays;
public class TesteArray1{
public static void main(String[]args) {

int[]vetor= {60,30,50,20,40,10};
int chaveProcura, indice;
System.out.println("Numero de Elementos do Vetor:"+vetor.length);
System.out.println("Vetor Original:"+Arrays.toString(vetor));
//Retorna uma String com conte�do do vetor de int.
Arrays.sort(vetor);
System.out.println("Vetor Ordenado:"+Arrays.toString(vetor));
chaveProcura=30;
indice=Arrays.binarySearch(vetor,chaveProcura);
//vetor deve estar ordenado.
System.out.println("Chave:"+chaveProcura);
System.out.println("�ndice do Elemento Chave:"+indice);
}
}
