package IFactory;

import Factory.Fruit;
import Factory.Vegetables;

public interface AFruitAndVegetables {
    public Fruit CreateF();
    public Vegetables CreateV();
}
