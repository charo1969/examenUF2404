package modelo;

public class Hora {

	/**
	 * Atributos de clase privados
	 */

	private int horas;
	private int minutos;
	private int segundos;

	/**
	 * Métodos de clase
	 * 
	 */

	// constructor sin parámetros
	public Hora() {
		super();
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
	}

	// constructor con parámetros
	public Hora(int horas, int minutos, int segundos) {
		super();
		if (horas < 24 && minutos < 60 && segundos < 60) {
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
		} else {
			horas = 00;
			minutos = 00;
			segundos = 00;

		}

	}

	// constructor de copia

	public Hora(Hora h) {
		this.horas = h.horas;
		this.minutos = h.minutos;
		this.segundos = h.segundos;
	}

	/**
	 * Método estatico y privado valida
	 * 
	 */

	private static boolean valida(int phora, int pminutos, int psegundos) {

		boolean vHora = false;

		if (phora < 24 && pminutos < 60 && psegundos < 60) {
			vHora = true;
		}
		return vHora;

	}

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

	// metodo setHora

	public void setHoras(int horas,int minutos,int segundos) {
		if()
	}

	// metodo toString
	@Override
	public String toString() {

		return String.format("La Hora es %.2f:%.2f:%2f", horas, minutos, segundos);

		// return "Hora [horas=" + horas + ", minutos=" + minutos + ", segundos=" +
		// segundos + "]";
	}
	// metodo aSegundos

	public int aSegundos() {
		return this.segundos;
	}

	public int deSegundos() {
		
		if()
		
	}

	public int segundosEntre() {

	}

}