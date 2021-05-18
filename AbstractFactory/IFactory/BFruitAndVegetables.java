package IFactory;

import Factory.Fruit;
import Factory.Vegetables;

public interface BFruitAndVegetables {
    public Fruit CreateF();
    public Vegetables CreateV();
}
