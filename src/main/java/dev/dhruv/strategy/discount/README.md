Strategy Pattern
- Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

we can create `Discounter` interface and use it  for different strategies, viz. `ChristmasDiscounter` and let's say `EasterDiscounter`.

But essentially this becomes a problem, since we need to create concrete class implementations for each different discount strategies.

