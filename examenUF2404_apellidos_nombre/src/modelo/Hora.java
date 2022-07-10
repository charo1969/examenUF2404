package modelo;

public class Hora {

	/**
	 * ATRIBUTOS
	 */
	private int modo; // EN 24 HORAS.
	private int horas;
	private int minutos;
	private int segundos;

	// CONSTRUCTOR SIN PARÁMETROS
	public Hora() {
		this.modo = 24; // SON 24 HORAS
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
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

		this.modo = 24;
		this.horas = h % 24;
		this.minutos = m % 60;
		this.segundos = s % 60;

	}

	// CONSTRUCTOR CON COPIA

	public Hora(Hora h) {
		this.horas = h.horas;
		this.minutos = h.minutos;
		this.segundos = h.segundos;
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

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {
		this.modo = modo;
	}

	// METODO TOSTRING CON STRING.FORMAT
	@Override
	public String toString() {

		return String.format("La Hora es %.2f:%.2f:%2f", horas, minutos, segundos);

	}
	
	/**
	 * METODO VALIDA
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}