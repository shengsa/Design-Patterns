package Vegetables;

import Factory.Vegetables;

public class Cabbage extends Vegetables {
    public String name;
    public void eat() {
        super.eat(this.name);
    }
    public Cabbage(String name) {
        this.name = name;
    }
}
