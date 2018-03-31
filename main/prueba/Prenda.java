package prueba;

public class Prenda {

	private String nombre;

	public Prenda(String nombre) {
		this.nombre = nombre;
	}

	public String nombreFancy() {
		return "super duper " + nombre;
	}

}