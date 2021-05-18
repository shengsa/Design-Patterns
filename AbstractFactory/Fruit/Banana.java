package Fruit;

import Factory.Fruit;

public class Banana extends Fruit {
    public String name;
    public void eat() {
        super.eat(this.name);
    }
    public Banana(String name) {
        this.name = name;
    }
}
