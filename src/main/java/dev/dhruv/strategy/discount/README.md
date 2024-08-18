## Strategy Pattern
* Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

* we can create `Discounter` interface and use it  for different strategies, viz. `ChristmasDiscounter` and let's say `EasterDiscounter`.

* But essentially this becomes a problem, since we need to create concrete class implementations for each different discount strategies.

* instead lets implement a `DiscountContext`, that accepts the strategy and then applies the respective algorithm.

* Now, with expose `setDiscounter(Discounter discounter)` and we can then add any new strategy while keeping the client free from setting any discount context that client wants at runtime.
