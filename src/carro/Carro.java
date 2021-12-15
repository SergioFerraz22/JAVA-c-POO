package carro;
public class Carro {
  
  //atributos
  private String marca;  
  private String cor;   
  private boolean motorEstado;
  private int rotacaoMotor;
  
  //construtores
  public Carro( ) {
        //setMarca("Palio");
        //setCor("azul");
        setMotorEstado(true);
        setRotacaoMotor(100);
        
        //marca = "Palio";
        ///cor = "azul";
        //motorEstado = true;    
        //rotacaoMotor = 1000;  
  }
  
  public Carro(String marca, String cor) {
          setMarca(marca);
          setCor(cor);
          
          //this.marca = marca;
          //this.cor = cor;
          //motorEstado = false;
          //rotacaoMotor = 500;
  }
  
  public Carro(String marca, String cor, boolean motorEstado, int rotacaoMotor) {
          
          setMarca(marca);
          setCor(cor);
          setMotorEstado(motorEstado);
          setRotacaoMotor(rotacaoMotor);
          
          /*
          this.marca = marca;
          this.cor = cor;
          this.motorEstado = motorEstado;
          this.rotacaoMotor = rotacaoMotor;
          */
  }
  
  //setters e getters
  public void setMarca(String marca) {
          this.marca = marca;
  }
  public String getMarca() {
          return marca;
  }
  
  public void setCor(String cor) {
          this.cor = cor;
  }
  public String getCor() {
          return cor;
  }
  
  public void setMotorEstado(boolean motorEstado) {
          this.motorEstado = motorEstado;
  }
  public boolean getMotorEstado() {
          return motorEstado;
  }
  
  public void setRotacaoMotor(int rotacaoMotor) {
          this.rotacaoMotor = rotacaoMotor;
  }
  public int getRotacaoMotor() {
          return rotacaoMotor;
  }
  
  //métodos
  void ligaMotor() {
        setMotorEstado(true);
    //motorEstado = true;
    System.out.println("O motor foi ligado.");
  }
  void desligaMotor() {
    setMotorEstado(false);
        //motorEstado = false;
    System.out.println("O motor foi desligado.");
  }
  void mostraAtributos() {
    //System.out.println("O carro tem a cor " +  cor + "e eh da marca " + marca);
        System.out.println("O carro tem a cor usando get() " +  getCor() + "e eh da marca " + getMarca());
    System.out.println("A rotacao do motor eh " +  getRotacaoMotor());
    if (getMotorEstado() == true)
      System.out.println("O motor ja esta ligado.");
    else {
      System.out.println("O motor esta desligado.");
    }
  }
  
}//fim classe

