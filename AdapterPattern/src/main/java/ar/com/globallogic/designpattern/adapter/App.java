package ar.com.globallogic.designpattern.adapter;

/**
 * Demo Adapter pattern !
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Demo de patron adapter");

		DomocileAdapter adapter = new DomocileAdapterImpl(loadDomiciles());

		User jorge = new User("Jorge", "Perez", 1, 30, adapter);

		System.out.println(jorge.toString());
	}

	/*
	 * CARGA DE DATOS
	 */
	private static DomicileService loadDomiciles() {
		Domicile agusCasa = new Domicile("siempre viva", 88, "piso 1", "depto A");
		Domicile jorgeCasa = new Domicile("castillo de principe", 200, "piso 10", "depto b");
		Domicile rodriCasa = new Domicile("Desierto", 10000, "planta baja", "");
		Domicile diegoCasa = new Domicile("pandora", 2, "jungla ", "arbol A");
		DomicileService domicileService = new DomicileService();
		domicileService.add(agusCasa);
		domicileService.add(jorgeCasa);
		domicileService.add(rodriCasa);
		domicileService.add(diegoCasa);
		return domicileService;
	}
}
