package pack.modelo;

public class TableroBuilderNiv2 extends TableroBuilder {
	private TableroBuilderNiv2 mTabNiv2 = new TableroBuilderNiv2();
	
	private TableroBuilderNiv2(){
		
	}
	
	public TableroBuilderNiv2 getTableroBuilderNiv2(){
		return mTabNiv2;
	}
	@Override
	public void ponerFila(){
		super.tablero.setFilas(10);
	}
	@Override
	public void ponerColumnas(){
		super.tablero.setColumnas(15);
	}
	@Override
	public void calcularNumMinas(){
		int nminas= 15*2;
		super.tablero.setNumMinas(nminas);
	}
	@Override
	public void ponerCasillas(){
		super.tablero.rellenarMatrix();
	}

	@Override
	public void construirTablero() {
		super.tablero=new Tablero(10,15,30);
		
		
	}


	
}