package pack.modelo;

import java.util.Iterator;

import pack.modelo.Casilla;
import pack.modelo.CasillaNum;
import pack.modelo.CasillaVacia;

public class CasillaVacia extends Casilla {

	public CasillaVacia(int pFila, int pColumna) {
		super(pFila, pColumna);
	}

	private Iterator<Casilla> getIterator() {
		return super.getListaVecinas().iterator();
	}

	public void destaparContiguas() {

		Iterator<Casilla> itr = this.getIterator();

		while (itr.hasNext()) {
			Casilla act = itr.next();
			if (act instanceof CasillaVacia) {
				CasillaVacia c = (CasillaVacia) act;
				c.darVuelta();
				c.destaparContiguas();
			} else if (act instanceof CasillaNum) {
				CasillaNum c = (CasillaNum) act;
				c.destaparCasilla();
			}
		}
	}

	public void destaparCasilla() {
		if (this.isDestapada() == false) {
			this.darVuelta();
			this.destaparContiguas();
		}

	}

	public void darVuelta() {
		this.setDestapada(true);
	}
}
