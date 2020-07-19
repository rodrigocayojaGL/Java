package ar.com.globallogic.designpattern;

import ar.com.globallogic.designpattern.facade.CheckFacade;

public class App {

	public static void main(String[] args) {
		
		final CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");

		final CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
	}

}
