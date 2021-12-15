package colecao;
import java.util.ArrayList;
public class TestaArrayList1 {
public static void main(String[]args) {
	
	ArrayList <String> nome = new ArrayList<>();
	//ArrayList nome = newArrayList()://funciona assim tambem
	nome.add("Ana"); nome.add("Joao");nome.add("Maria");
	nome.add("Pedro"); nome.add("Jose");
	ArrayList<Integer> idade = new ArrayList<>();
	idade.add(18); idade.add(20); idade.add(30);
	idade.add(22); idade.add(48);
	int n = nome.size();
	for (int i=0;i<n;i++)
		System.out.printf("Nome: %-20s idade %d\n" ,nome.get(i), idade.get(i));
}
}
