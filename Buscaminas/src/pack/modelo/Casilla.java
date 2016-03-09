package pack.modelo;

import java.util.ArrayList;

public class Casilla {

	private int fila;
	private int columna;
	private ArrayList<Casilla> listaVecinas;
	
	private Casilla(int pFila, int pColumna){
		this.fila=pFila;
		this.columna=pColumna;
		this.listaVecinas=new ArrayList<Casilla>();
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int pFila) {
		this.fila = pFila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int pColumna) {
		this.columna = pColumna;
	}

	public ArrayList<Casilla> getListaVecinas() {
		return listaVecinas;
	}

	public void setListaVecinas(ArrayList<Casilla> pListaVecinas) {
		this.listaVecinas = pListaVecinas;
	}
	
}
