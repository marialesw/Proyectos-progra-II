package models;

public class Part_Arb {

	private int idPersona;
	private int idPartido;
	private RolArbitro rolArbitro;
	
	public Part_Arb(int idPersona, int idPartido, RolArbitro rolArbitro) {
		super();
		this.idPersona = idPersona;
		this.idPartido = idPartido;
		this.rolArbitro = rolArbitro;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public RolArbitro getRolArbitro() {
		return rolArbitro;
	}
}