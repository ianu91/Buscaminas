package pack.modelo;

public class Buscaminas {

	private static Buscaminas miBuscaminas=new Buscaminas();
	private TableroBuilder tableroBuilder;
	
	private Buscaminas(){}
			
	public static Buscaminas getBuscaminas(){
		return miBuscaminas;
	}
	
	public void setTableroBuilder(TableroBuilder pTabBuilder){
		this.tableroBuilder=pTabBuilder;
	}
	
	public Tablero getTablero(){
		return tableroBuilder.getTablero();
	}
	
	private void construirTablero(){
		tableroBuilder.ponerFila();
		tableroBuilder.ponerColumna();
		tableroBuilder.calcularNumMinas();
		tableroBuilder.ponerCasillas();
	}
	
	//TODO public void jugar(){}
	
}
