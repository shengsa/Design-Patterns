package FactoryImpl;

import Factory.Fruit;
import Factory.Vegetables;
import Fruit.Apple;
import Vegetables.Cabbage;
import IFactory.AFruitAndVegetables;

public class AConFV implements AFruitAndVegetables {
    public Fruit CreateF() {
        Apple apple = new Apple("苹果");
        return apple;
    };
    public Vegetables CreateV() {
        Cabbage cabbage = new Cabbage("大白菜");
        return cabbage;
    };
}
