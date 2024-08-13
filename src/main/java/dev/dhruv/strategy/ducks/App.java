package dev.dhruv.strategy.ducks;

public class App {

    public static void main(String args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.quack();   // can have strategy quack
        wildDuck.fly();     // can have strategy fly

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();     // even rubber duck can access the quack strategy
    }
}
