
package professor;

public class ProfessorHorista extends Professor{
        
        //atributos
        private float horasTrabalhadas;
        private float valorHora;

        //getters e setters
        public void setHorasTrabalhadas(float horasTrabalhadas) {
                this.horasTrabalhadas = horasTrabalhadas; 
        }
        public float getHorasTrabalhadas( ) {
                return horasTrabalhadas; 
        }

        public void setValorHora(int valorHora) {
                this.valorHora = valorHora;
        }
        public float getValorHora( ) {
                return valorHora; 
        }

        //método abstrato
        public double calculaSalario( ) {
                return(getHorasTrabalhadas() * getValorHora() - super.getDesconto() );  
        }
}//fim classe