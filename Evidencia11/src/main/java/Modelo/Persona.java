package Modelo;

public class Persona {

	private String Nombre;
	private String Apellido;
	private String Rut;

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param rut
	 */
	public Persona(String nombre, String apellido, String rut) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	@Override
	public String toString() {
		return "{\"Persona\":{"
				+ "\"Nombre\":\"" + Nombre + "\""
				+ ", \"Apellido\":\"" + Apellido + "\""
				+ ", \"Rut\":\"" + Rut + "\""
				+ "}}";
	}

}