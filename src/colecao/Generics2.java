package colecao;

public class Generics2 <T>{
	private T tipoObjeto; //T Eh o tipo do objeto
	public void setT(T tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}
public T getT() {
	return this.tipoObjeto;
}
}
