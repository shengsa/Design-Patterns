import Factory.Fruit;
import Factory.Vegetables;
import FactoryImpl.AConFV;
import FactoryImpl.BConFV;

public class main {
    public static void main(String[] args) {
        AConFV aConFV = new AConFV();
        BConFV bConFV = new BConFV();
        Fruit aFruit = aConFV.CreateF();
        Vegetables aVegetables = aConFV.CreateV();
        Fruit bFruit = bConFV.CreateF();
        Vegetables bVegetables = bConFV.CreateV();
        aVegetables.eat();
        aFruit.eat();
        bFruit.eat();
        bVegetables.eat();
    }
}
