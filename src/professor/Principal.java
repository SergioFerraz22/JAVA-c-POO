package professor;

public class Principal {
        
        public static void main(String args[ ]) {
                
                //instanciando um objeto de ProfessorDedicado
                ProfessorDedicado     profDedicado     = new ProfessorDedicado();
                ProfessorHorista                   profHorista              = new ProfessorHorista();
                
                profDedicado.setMatricula ("1015");
                profDedicado.setNome("Joao");
                profDedicado.setIdade(20);
                profDedicado.setDesconto(100);
                profDedicado.setSalarioBruto(5000);
                
                profHorista.setMatricula ("1025");
                profHorista.setNome("Maria");
                profHorista.setIdade(25);
                profHorista.setDesconto(150);
                profHorista.setHorasTrabalhadas(100);
                profHorista.setValorHora(100);

                System.out.println("Salario:" + profDedicado.calculaSalario());
                System.out.println("Salario:" + profHorista.calculaSalario());
        }
}//fim classe



