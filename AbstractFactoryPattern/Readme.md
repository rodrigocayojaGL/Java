# Abstract Factory Pattern

# Introducción
**Fábrica abstracta es un patron creacinal** permite independizar al sistema de como sus objetos son creados y/o representados.

El patrón Abstract Factory nos permite crear, mediante una interfaz, conjuntos o 
familias de objetos (denominados productos) que dependen mutuamuente y todo esto sin especificar cual es el objeto concreto.


## Diagrama

![image](http://www.baeldung.com/wp-content/uploads/2018/11/updated_abstract_factory.jpg)

Como se relaciona el proyecto con el diagrama de clases:  
* **Client:** App
* **FactoryProvider:** factorProvider 
* **AbstractFactory:** AbstractFactory 
* **FactoryA:** FactoryBD
* **InterfaceA:** ConnectionBDService
* **ImplementaciónA1:** ConnectionBDEmptyServiceImpl 
* **ImplementaciónA2:** ConnectionBDMySqlServiceImpl 
* **ImplementaciónA3:** ConnectionBDOracleServiceImpl
* **FactoryB:** FactoryRest
* **InterfaceB:** ConnectionRestService
* **ImplementaciónB1:** ConnectionRestNoAreaServiceImpl
* **ImplementaciónB2:** ConnectionRestPurchasesServiceImpl 
* **ImplementaciónB3:** ConnectionRestSalesServiceImpl

### Que usos tiene el patrón Abstract Factory?

Este patrón se puede aplicar cuando:
* **Un sistema debe ser independiente de como sus objetos son creados.**
* **Un sistema debe ser ‘configurado’ con una cierta familia de productos.**
* **Se necesita reforzar la noción de dependencia mutua entre ciertos objetos.**


Enlaces:
* [baeldung - Abstract Factory Pattern in Java](https://www.baeldung.com/java-abstract-factory-pattern)
* [refactoring.guru - Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory) 
