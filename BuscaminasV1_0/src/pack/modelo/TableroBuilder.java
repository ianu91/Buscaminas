package pack.modelo;

public abstract class TableroBuilder {
	protected Tablero tablero;
	public TableroBuilder(){}
	public abstract void construirTablero();
	public void ponerCasillas(){
		tablero.rellenarMatrix();
	}
	
}

