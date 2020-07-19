# Facade Pattern


# Introducci�n
 Es un **patr�n de dise�o estructural** que proporciona una interfaz simplificada para una biblioteca, un marco o cualquier otro conjunto complejo de clases.
 
## Problema
	Imagine que debe hacer que su c�digo funcione con un amplio conjunto de objetos que pertenecen 
	a una biblioteca o marco sofisticado. Por lo general, necesitar�a inicializar todos esos objetos,
	realizar un seguimiento de las dependencias, ejecutar m�todos en el orden correcto, etc.

## Soluci�n
	Una fachada es una clase que proporciona una interfaz simple a un subsistema complejo que contiene 
	muchas partes m�viles. Una fachada puede proporcionar una funcionalidad limitada en comparaci�n con 
	trabajar directamente con el subsistema. Sin embargo, incluye solo aquellas caracter�sticas que 
	realmente les interesan a los clientes. 
 
## Diagrama

![image](http://refactoring.guru/images/patterns/diagrams/facade/structure-2x.png)

* **Client: App** 
* **Facade: CheckFacade** 
* **SubSystemClass: AvionApi** 
* **SubSystemClass: HotelApi**

Enlaces:
* [Facade Pattern in Java](https://refactoring.guru/design-patterns/facade)
