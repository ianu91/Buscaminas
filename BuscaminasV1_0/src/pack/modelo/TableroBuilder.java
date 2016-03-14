package pack.modelo;

public abstract class TableroBuilder {
	protected Tablero tablero;
	public TableroBuilder(){}
	public abstract void construirTablero();
	public abstract void ponerFila();
	public abstract void ponerColumna();
	public abstract void calcularNumMinas();
	public void ponerCasillas(){
		tablero.rellenarMatrix();
	}
	
}

