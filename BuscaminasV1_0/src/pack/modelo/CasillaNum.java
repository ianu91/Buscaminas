package pack.modelo;

import java.util.Iterator;

public class CasillaNum extends Casilla{
	
	public CasillaNum(int pFila, int pColumna){
		super(pFila,pColumna);
	}
	
	private Iterator<Casilla> getIterator() {
		return super.getListaVecinas().iterator();
	}
	
	public int calcularNumMinasVecinas(){
		
		Iterator<Casilla> itr = this.getIterator();
		int cont=0;
		while (itr.hasNext()) {
			Casilla act= itr.next();
			if (act instanceof CasillaBoom){
				cont++;
			}
		}
		return cont;
	}

	@Override
	public void destaparCasilla() {
		this.setDestapada(true);
		
	}
	
}
