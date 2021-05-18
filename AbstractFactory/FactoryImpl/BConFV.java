package FactoryImpl;

import Factory.Fruit;
import Factory.Vegetables;
import Fruit.Banana;
import Vegetables.Tomato;
import IFactory.BFruitAndVegetables;

public class BConFV implements BFruitAndVegetables {
    public Fruit CreateF() {
        Banana banana = new Banana("香蕉");
        return banana;
    };
    public Vegetables CreateV() {
        Tomato tomato = new Tomato("西红柿");
        return tomato;
    };
}
