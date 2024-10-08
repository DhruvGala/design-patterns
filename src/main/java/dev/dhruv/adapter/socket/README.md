## Adapter Pattern
* Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. 
* The object that joins these unrelated interface is called an Adapter.

### example

* One of the great real life example of Adapter design pattern is mobile charger. Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter between mobile charging socket and the wall socket. 
* We will try to implement multi-adapter using adapter design pattern in this tutorial. So first of all we will have two classes - Volt (to measure volts) and Socket (producing constant volts of 120V).

### Two Way Adapter Pattern
While implementing Adapter pattern, there are two approaches:

* Class Adapter - This form uses java inheritance and extends the source interface, in our case Socket class.
* Object Adapter - This form uses Java Composition and adapter contains the source object.

