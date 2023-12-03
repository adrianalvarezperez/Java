package _01_CLASE_MADRE_CLASE_HIJA_;

public class FIGURA {

	
	//PROPIEDADES
		private int coordenadaX;
		private int coordenadaY;
		protected int ancho;
		protected int alto;
		private String tipo;
		
		
	//CONSTRUCTOR
	public FIGURA (int coordenadaX, int coordenadaY, int ancho, int alto, String tipo){
			this.coordenadaX= coordenadaX;
			this.coordenadaY= coordenadaY;
			this.ancho= ancho;
			this.alto= alto;
			this.tipo= tipo;
	   }

	
	 //MÉTODO DATOS
	 public String consultar() {
			return tipo+": CoordenadaX="+coordenadaX+", CoordenadaY="+coordenadaY+
					", Ancho="+ancho+", Alto="+alto;
	   }
	   
	 
	 //MÉTODO GET
	 public int getCoordenadaX() {
			return coordenadaX;
	   }
	 public int getCoordenadaY() {
			return coordenadaY;
	   }
	 public int getAncho() {
			return ancho;
	   }
	 public int getAlto() {
			return alto;
	   }


	@Override
	public String toString() {
		return "FIGURA [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY +
				", ancho=" + ancho + ", alto=" + alto + ", tipo=" + tipo + "]";
	}
	 
	 
}
