package ar.com.globallogic.designpattern.facade.api;

public class AvionApi {

	public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		System.out.println("======Vuelos encontrados=======");
		System.out.println("Para " + destino + " desde " + origen);
		System.out.println("Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta);
		System.out.println("==============================");
	}

}
