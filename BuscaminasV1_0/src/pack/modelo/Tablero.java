package pack.modelo;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
	private int filas;
	private int columnas;
	private int numMinas;
	private Casilla [][] matrix;
	
	public Tablero(int pFilas, int pColumnas, int pNumMinas){
		this.filas=pFilas;
		this.columnas=pColumnas;
		this.numMinas=pNumMinas;
		this.matrix= new Casilla[this.filas][this.columnas];
		
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public int getNumMinas() {
		return numMinas;
	}

	public void setNumMinas(int numMinas) {
		this.numMinas = numMinas;
	}
	
	public boolean tieneMina(Casilla pCasilla){
		if(pCasilla instanceof CasillaBoom ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void rellenarMatrix(){
		int nMinas=getNumMinas();
		Random r= new Random();
		int f=r.nextInt(filas);
		int c=r.nextInt(columnas);/*NO SE SI ES FILAS O GETFILAS?¿*/
		while(nMinas>0){
			if( matrix[f][c]==null){
				CasillaBoom b=new CasillaBoom(f,c);
				this.matrix[f][c]=b;				
				nMinas--;
			}
		}
		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++){
				if(matrix[i][j]==null){
					CasillaNum casillaNum =new CasillaNum(i,j);
					matrix[i][j]=casillaNum;
					int nVecinas = casillaNum.numMinasVecinas();
					if(nVecinas==0){
						CasillaVacia cVacia=new CasillaVacia(i,j);
						matrix[i][j]= cVacia;
						cVacia.setFila(i);
						cVacia.setColumna(j);
					}
					else{
						casillaNum.setFila(i);
						casillaNum.setColumna(j);
					}
				}
			}
		}
		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++){
				Casilla act=matrix[i][j];
				llenarListaVecinas(act);
			}
		}
		
		
	}
	
	private void llenarListaVecinas(Casilla pCasilla){
		int i=pCasilla.getFila();
		int j=pCasilla.getColumna();
		ArrayList<Casilla> l =pCasilla.getListaVecinas();
		if(matrix[i-1][j-1]!=null){
			l.add(matrix[i-1][j-1]);
		}
		if(matrix[i-1][j]!=null){
			l.add(matrix[i-1][j]);
		}
		if(matrix[i-1][j+1]!=null){
			l.add(matrix[i-1][j+1]);
		}
		if(matrix[i][j-1]!=null){
			l.add(matrix[i][j-1]);
		}
		if(matrix[i][j]!=null){
			l.add(matrix[i][j]);
		}
		if(matrix[i][j+1]!=null){
			l.add(matrix[i][j+1]);
		}
		if(matrix[i+1][j]!=null){
			l.add(matrix[i+1][j]);
		}
		if(matrix[i+1][j+1]!=null){
			l.add(matrix[i+1][j+1]);
		}
	}
	
	
}

