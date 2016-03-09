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
}
