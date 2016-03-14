package pack.modelo;

public class TableroBuilderNiv3 extends TableroBuilder {
	private TableroBuilderNiv3 mTabNiv3 = new TableroBuilderNiv3();
	
	private TableroBuilderNiv3(){
		
	}
	
	public TableroBuilderNiv3 getTableroBuilderNiv2(){
		return mTabNiv3;
	}
	@Override
	public void ponerFila(){
		super.tablero.setFilas(12);
	}
	@Override
	public void ponerColumna(){
		super.tablero.setColumnas(25);
	}
	@Override
	public void calcularNumMinas(){
		int nminas= 25*2;
		super.tablero.setNumMinas(nminas);
	}
	@Override
	public void ponerCasillas(){
		super.tablero.rellenarMatrix();
	}

	@Override
	public void construirTablero() {
		super.tablero=new Tablero(12,25,50);
		ponerFila();
		ponerColumna();
		ponerCasillas();
		
	}

	
	
}