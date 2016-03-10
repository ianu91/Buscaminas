package pack.modelo;

public class TableroBuilderNiv1 extends TableroBuilder {

	private TableroBuilderNiv1 miTableroBuilderNiv1=new TableroBuilderNiv1();
	private Tablero tablero;
	
	/*
	 * ponerFila(),ponerColumna(),calcularNumMinas() estaban implementados porque
	 * la constructora Tablero() no tenia ningun parametro, entonces los atributos de
	 * tablero se cambiaban con estos metodos.
	 * Ahora, como si tienen parametros, estos metodos no son necesarios ya que 
	 * se ponen directamente en el new de la constructora.
	 * 
	 * */
	
	@Override
	public void ponerFila() {}

	@Override
	public void ponerColumna() {}

	@Override
	public void calcularNumMinas() {}
	
	public void construirTablero(){
		tablero=new Tablero(7,10,10);
	}
}
