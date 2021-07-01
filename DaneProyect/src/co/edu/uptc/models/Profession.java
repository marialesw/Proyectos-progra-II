package co.edu.uptc.models;

public enum Profession {
	
	NINGUNA(0, "Ninguna"),
	ADMINISTRACION(1, "Administración y Afines"),
	AGRONOMIA(2, "Agronomía"),
	ANTROPOLOGIA(3, "Antropología"),
	ARQUEOLOGIA(4, "Arqueología"),
	PROFESIONAL(5, "Profesional"),
	ARQUITECTURA(6, "Arquitectura y Afines"),
	ARTES_LIBERALES(7, "Artes Liberales"),
	ARTES_PLÁSTICAS(8, "Artes Plásticas y Visuale"),
	BACTERIOLOGÍA(9, "Bacteriología"),
	BIBLIOTECOLOGÍA(10, "Bibliotecología"),
	BIOLOGÍA_Y_AFINES(11, "Biología y afines"),
	CARTOGRAFÍA(12, "Cartografía"),
	CIENCIAS_POLÍTICAS(13, "Ciencia Política y Relaciones Internacionales"),
	CIENCIAS_SOCIALES(14, "Ciencias Sociales"),
	TELEVISION_Y_AFINES(15, "Cine y Televisión y afines"),
	NEGOCIOS_INTERNACIONALES(16, "Comercio Exterior y Negocios Internacionales"),
	COMUNICACIÓN_SOCIAL(17, "Comunicación Social – Periodismo"),
	CONTADURIA(18, "Contaduría Pública"),
	EDUCACIÓN_FÍSICA(19, "Educación física y Recreación"),
	DERECHO(20, " Derecho Y Afines"),
	DISEÑO_DE_MODAS(21, "Diseño de Modas"),
	DISEÑO_GRÁFICO(22, "Diseño gráfico"),
	ECONOMÍA(23, "Economía y afines"),
	EDUCACIÓN_BÁSICA(24, "Educación básica"),
	EDUCACIÓN_MEDIA(25, "Educación media"),
	EDUCACIÓN_PREESCOLAR(26, " Educación preescolar "),
	ENFERMERÍA(27, "Enfermería"),
	FARMACIA(28, "Farmacia"),
	FILOSOFÍA(29, "Filosofía"),
	FÍSICA(30, "Física"),
	FISIOTERAPIA(31, "Fisioterapia"),
	GEOGRAFÍA(32, "Geografía"),
	GEOLOGÍA(33, "Geología "),
	GESTIÓN_TURÍSTICA(34, "Gestión turística y hotelera"),
	HISTORIA(35, "Historia"),
	INGENIERÍA_AERONÁUTICA(36, "Ingeniería Aeronáutica"),
	INGENIERÍA_AGRÍCOLA(37, "Ingeniería Agrícola"),
	INGENIERÍA_AGROINDUSTRIAL(38, "Ingeniería Agroindustrial"),
	INGENIERÍA_AGRONÓMICA(39, "Ingeniería Agronómica"),
	INGENIERÍA_AMBIENTAL(40, " Ingeniería Ambiental "),
	INGENIERÍA_BIOMÉDICA(41, "Ingeniería Biomédica"),
	INGENIERÍA_CIVIL(42, "Ingeniería Civil"),
	INGENIERÍA_DE_SISTEMAS(43, "Ingeniería de Sistemas o Informática"),
	INGENIERÍA_DE_TELECOMUNICACIONES(44, "Ingeniería de Telecomunicaciones"),
	INGENIERÍA_ELECTRÓNICA(45, "Ingeniería Electrónica"),
	INGENIERÍA_INDUSTRIAL(46, " Ingeniería Industrial"),
	INGENIERÍA_METALÚRGICA(47, "Ingeniería Metalúrgica"),
	LENGUAS_MODERNAS(48, "Lenguas Modernas"),
	LICENCIATURA_CIENCIAS_NATURALES(49, "Licenciatura en Ciencias Naturales y Educación Ambiental"),
	LITERATURA(50, "Literatura, linguistica y afines"),
	MATEMÁTICAS(51, " Matemáticas, Estadística y afines"),
	MEDICINA(52, "Medicina"),
	VETERINARIA(53, "Medicina Veterinaria"),
	MÚSICA(54, " Música y afines"),
	ODONTOLOGÍA(55, "Odontología"),
	PSICOLOGÍA(56, "Psicología"),
	SALUD_OCUPACIONAL(57, " salud ocupacional"),
	TECNOLOGÍA_OBRAS_CIVILES(58, "Tecnología en Obras Civiles"),
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
