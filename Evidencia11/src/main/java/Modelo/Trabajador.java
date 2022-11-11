package Modelo;

public class Trabajador extends Persona {
	private String Isapre;
	private String AFP;

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param isapre
	 * @param afp
	 */
	public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
		super(nombre, apellido, rut);
		this.Isapre = isapre;
		this.AFP = afp;
	}

	public String getIsapre() {
		return Isapre;
	}

	public void setIsapre(String isapre) {
		Isapre = isapre;
	}

	public String getAFP() {
		return AFP;
	}

	public void setAFP(String AFP) {
		this.AFP = AFP;
	}

	@Override
	public String toString() {
		return "{\"Trabajador\":"
				+ super.toString()
				+ ", \"Isapre\":\"" + Isapre + "\""
				+ ", \"AFP\":\"" + AFP + "\""
				+ "}";
	}

}