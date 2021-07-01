package co.edu.uptc.models;

public enum Profession {
	
	NINGUNA(0, "Ninguna"),
	ADMINISTRACION(1, "Administraci�n y Afines"),
	AGRONOMIA(2, "Agronom�a"),
	ANTROPOLOGIA(3, "Antropolog�a"),
	ARQUEOLOGIA(4, "Arqueolog�a"),
	PROFESIONAL(5, "Profesional"),
	ARQUITECTURA(6, "Arquitectura y Afines"),
	ARTES_LIBERALES(7, "Artes Liberales"),
	ARTES_PL�STICAS(8, "Artes Pl�sticas y Visuale"),
	BACTERIOLOG�A(9, "Bacteriolog�a"),
	BIBLIOTECOLOG�A(10, "Bibliotecolog�a"),
	BIOLOG�A_Y_AFINES(11, "Biolog�a y afines"),
	CARTOGRAF�A(12, "Cartograf�a"),
	CIENCIAS_POL�TICAS(13, "Ciencia Pol�tica y Relaciones Internacionales"),
	CIENCIAS_SOCIALES(14, "Ciencias Sociales"),
	TELEVISION_Y_AFINES(15, "Cine y Televisi�n y afines"),
	NEGOCIOS_INTERNACIONALES(16, "Comercio Exterior y Negocios Internacionales"),
	COMUNICACI�N_SOCIAL(17, "Comunicaci�n Social � Periodismo"),
	CONTADURIA(18, "Contadur�a P�blica"),
	EDUCACI�N_F�SICA(19, "Educaci�n f�sica y Recreaci�n"),
	DERECHO(20, " Derecho Y Afines"),
	DISE�O_DE_MODAS(21, "Dise�o de Modas"),
	DISE�O_GR�FICO(22, "Dise�o gr�fico"),
	ECONOM�A(23, "Econom�a y afines"),
	EDUCACI�N_B�SICA(24, "Educaci�n b�sica"),
	EDUCACI�N_MEDIA(25, "Educaci�n media"),
	EDUCACI�N_PREESCOLAR(26, " Educaci�n preescolar "),
	ENFERMER�A(27, "Enfermer�a"),
	FARMACIA(28, "Farmacia"),
	FILOSOF�A(29, "Filosof�a"),
	F�SICA(30, "F�sica"),
	FISIOTERAPIA(31, "Fisioterapia"),
	GEOGRAF�A(32, "Geograf�a"),
	GEOLOG�A(33, "Geolog�a "),
	GESTI�N_TUR�STICA(34, "Gesti�n tur�stica y hotelera"),
	HISTORIA(35, "Historia"),
	INGENIER�A_AERON�UTICA(36, "Ingenier�a Aeron�utica"),
	INGENIER�A_AGR�COLA(37, "Ingenier�a Agr�cola"),
	INGENIER�A_AGROINDUSTRIAL(38, "Ingenier�a Agroindustrial"),
	INGENIER�A_AGRON�MICA(39, "Ingenier�a Agron�mica"),
	INGENIER�A_AMBIENTAL(40, " Ingenier�a Ambiental "),
	INGENIER�A_BIOM�DICA(41, "Ingenier�a Biom�dica"),
	INGENIER�A_CIVIL(42, "Ingenier�a Civil"),
	INGENIER�A_DE_SISTEMAS(43, "Ingenier�a de Sistemas o Inform�tica"),
	INGENIER�A_DE_TELECOMUNICACIONES(44, "Ingenier�a de Telecomunicaciones"),
	INGENIER�A_ELECTR�NICA(45, "Ingenier�a Electr�nica"),
	INGENIER�A_INDUSTRIAL(46, " Ingenier�a Industrial"),
	INGENIER�A_METAL�RGICA(47, "Ingenier�a Metal�rgica"),
	LENGUAS_MODERNAS(48, "Lenguas Modernas"),
	LICENCIATURA_CIENCIAS_NATURALES(49, "Licenciatura en Ciencias Naturales y Educaci�n Ambiental"),
	LITERATURA(50, "Literatura, linguistica y afines"),
	MATEM�TICAS(51, " Matem�ticas, Estad�stica y afines"),
	MEDICINA(52, "Medicina"),
	VETERINARIA(53, "Medicina Veterinaria"),
	M�SICA(54, " M�sica y afines"),
	ODONTOLOG�A(55, "Odontolog�a"),
	PSICOLOG�A(56, "Psicolog�a"),
	SALUD_OCUPACIONAL(57, " salud ocupacional"),
	TECNOLOG�A_OBRAS_CIVILES(58, "Tecnolog�a en Obras Civiles"),
	TRABAJO_SOCIAL(59, "Trabajo Social"),
	ZOOTECNIA(60, "zootecnia");
	 
	private Profession(int id, String name) {
		this.id = id;
		this.name = name;
	}
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
