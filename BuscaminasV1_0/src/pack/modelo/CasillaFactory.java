package pack.modelo;

public class CasillaFactory {

	private static CasillaFactory miCasillaFactory;
	private CasillaFactory(){}
	public static CasillaFactory getCasillaFactory(){
		if(miCasillaFactory==null){
			miCasillaFactory=new CasillaFactory();
		}
		return miCasillaFactory;
	}

	public Casilla createCasilla(String pTipo, int pFila, int pColum){
		Casilla c=null;
		if (pTipo.equals("vacia")){
			c=new CasillaVacia(pFila,pColum);
		}else if(pTipo.equals("boom")){
			c=new CasillaBoom(pFila,pColum);
		}else if(pTipo.equals("num")){
			c=new CasillaNum(pFila,pColum);
		}
		
		return c;
	}
	
}
