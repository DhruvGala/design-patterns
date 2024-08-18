## Factory Method Pattern
* The Factory Method Design Pattern is a creational design pattern used in software engineering to provide an interface for creating objects in a superclass, while allowing subclasses to alter the type of objects that will be created. 
* It encapsulates the object creation logic in a separate method, abstracting the instantiation process and promoting loose coupling between the creator and the created objects. 
* This pattern enables flexibility, extensibility, and maintainability in the codebase by allowing subclasses to define their own implementation of the factory method to create specific types of objects.

### example

* Consider a software application that needs to handle the creation of various types of vehicles, such as Two Wheelers, Three Wheelers, and Four Wheelers. Each type of vehicle has its own specific properties and behaviors.

* In the `Vehicle.class` we define abstract class that enables the subclasses to define their own functionality, however the object creation is still entrusted to `Client.class` based on the `type` parameter.
* This results into tight coupling between the client and the concrete classes (viz. `TwoWheeler.class` and `FourWheeler.class`). 
* The lifecycle of the objects is also maintained by the Client, this violates the Single Responsibility Principle, which states that class should have only one reason to change.
* Another limitation is in scalability, the `Client.class` needs to be modified everytime there is requirement for adding a new type of `Vehicle`.

### Solving above problems with Factory Method Pattern

* `AVehicle.class` serves as the Product interface, defining the common method `printVehicle()` that all concrete products must implement.
* `TwoWheelerVehicle.class` and `FourWheelerVehicle` are concrete product classes representing different types of vehicles, implementing the `printVehicle()` method.
* `IVehicleFactory` acts as the Creator interface (Factory Interface) with a method `createVehicle()` representing the factory method.
* `TwoWheelerFactory.class` and `FourWheelerFactory.class` are concrete creator classes (Concrete Factories) implementing the `IVehicleFactory` interface to create instances of specific types of vehicles.