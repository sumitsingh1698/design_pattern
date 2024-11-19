package org.learning.decorator;

public class CheeseTopping extends ToppingDecorator{
    CheeseTopping(BasePizza basePizza) {
        super(basePizza);

    }
    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
