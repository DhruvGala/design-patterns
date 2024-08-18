## Observer Pattern
* The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.
* It primarily deals with the interaction and communication between objects, specifically focusing on how objects behave in response to changes in the state of other objects.

### example
* Consider a scenario where you have a weather monitoring system. Different parts of your application need to be updated when the weather conditions change.
* The Observer Pattern helps decouple the weather monitoring system from the components interested in weather updates. Each component can register as an observer, and when the weather changes, the observers are notified. This way, adding or removing components doesn’t affect the weather monitoring system.