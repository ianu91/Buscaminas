package pack.modelo;

public abstract class TableroBuilder {
	protected Tablero tablero;
	public TableroBuilder(){}
	public void construirTablero(){
		tablero =new Tablero();
	}
	public abstract void ponerFila();
	public abstract void ponerColumna();
	public abstract int calcularNumMinas();
	public void ponerCasillas(){
		tablero.rellenarMatrix();
	}
	
}

