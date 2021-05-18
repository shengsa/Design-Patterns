package Fruit;

import Factory.Fruit;

public class Apple extends Fruit {
    public String name;
    public void eat() {
        super.eat(this.name);
    }
    public Apple(String name) {
        this.name = name;
    }
}
