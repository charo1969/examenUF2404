package modelo;

public class Hora {

	/**
	 * ATRIBUTOS
	 */
	
	private int horas;
	private int minutos;
	private int segundos;

	// CONSTRUCTOR SIN PARÁMETROS
	public Hora() {
		
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	/**
	 * METODO VALIDA STATIC , PUBLIC Y BOOLEAN
	 */
	
	public static boolean valida(int horas, int minutos, int segundos) {
		if (horas >=0 && horas <24 && minutos >= 0 && minutos <60 && segundos>=0 && segundos < 60 ) {
			return true;
		}
		return false;
	}
	

	/**
	 * CONSTRUCTOR CON PARAMETROS . AQUI PONGO QUE EL DIA TIENE 24 HORAS, QUE LOS
	 * MINUTOS SON 60 EN UNA HORA , QUE LOS SEGUNDOS SON 60 EN UN MINUTO.
	 * 
	 * @param h
	 * @param m
	 * @param s
	 */
	public Hora(int h, int m, int s) {

		setHora(horas, minutos, segundos); //colocamos el metodo setHora.
	}

	// CONSTRUCTOR CON COPIA

	public Hora(Hora h) {
		setHora(h.horas, h.minutos, h.segundos);//colocamos el método setHora.
	}

	/**
	 * GETTERS Y SETTERS
	 */

	// getters y setters
	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	
	public int getSegundos() {
		return segundos;
	}
	
	/**
	 * CREAMOS UN SETHORA 
	 */
	public void setHora(int horas, int minutos, int segundos) {
		if(valida(horas, minutos, segundos)) {
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
		}else {
			this.horas = 0;
			this.minutos = 0;
			this.segundos = 0;
		}
	}
	

	// METODO TOSTRING CON STRING.FORMAT
	@Override
	public String toString() {

		return String.format("La Hora es %.2d:%.2d:%2d", this.horas, this.minutos, this.segundos);

	}
	/**
	 * DE HORAS A SEGUNDOS MULTIPLICANDO POR 60 Y SUMANDOLAS A SEGUNDOS.
	 * @return
	 */
	public int aSegundos() {
		return this.horas*60+this.minutos*60+this.segundos;
	}
	/**
	 * DE SEGUNDOS A HORAS DIVIDIENDO Y QUEDANDONOS CON EL RESTO CADA VEZ
	 * @param segundos
	 */
	public void deSegundos(int segundos) {
		int resto = segundos % (86400);//Es el total de segundos en 24 horas.(3600*24)
		int seg = resto%60;
		resto = resto/60;
		
		int min = resto%60;
		int h = resto/60;
		this.setHora(h, min, segundos);
	}
	
	public int segundosEntre(Hora h) {
		return Math.abs(this.aSegundos()-h.aSegundos());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}