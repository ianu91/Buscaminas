package pack.modelo;

public class CasillaBoom extends Casilla{

	public CasillaBoom(int pFila, int pColumna){
		super(pFila,pColumna);
	}

	@Override
	public void destaparCasilla() {
		this.setDestapada(true);
	}
}
