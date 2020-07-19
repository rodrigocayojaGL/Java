# Facade Pattern


# Introducción
 Es un **patrón de diseño estructural** que proporciona una interfaz simplificada para una biblioteca, un marco o cualquier otro conjunto complejo de clases.
 
## Problema
	Imagine que debe hacer que su código funcione con un amplio conjunto de objetos que pertenecen 
	a una biblioteca o marco sofisticado. Por lo general, necesitaría inicializar todos esos objetos,
	realizar un seguimiento de las dependencias, ejecutar métodos en el orden correcto, etc.

## Solución
	Una fachada es una clase que proporciona una interfaz simple a un subsistema complejo que contiene 
	muchas partes móviles. Una fachada puede proporcionar una funcionalidad limitada en comparación con 
	trabajar directamente con el subsistema. Sin embargo, incluye solo aquellas características que 
	realmente les interesan a los clientes. 
 
## Diagrama

![image](http://refactoring.guru/images/patterns/diagrams/facade/structure-2x.png)

* **Client: App** 
* **Facade: CheckFacade** 
* **SubSystemClass: AvionApi** 
* **SubSystemClass: HotelApi**

Enlaces:
* [Facade Pattern in Java](https://refactoring.guru/design-patterns/facade)
