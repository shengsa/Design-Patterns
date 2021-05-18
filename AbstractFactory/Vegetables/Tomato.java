package Vegetables;

import Factory.Vegetables;

public class Tomato extends Vegetables {
    public String name;
    public void eat() {
        super.eat(this.name);
    }
    public Tomato(String name) {
        this.name = name;
    }
}
