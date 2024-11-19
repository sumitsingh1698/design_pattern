package org.learning.decorator;

public class VeggieTopping extends ToppingDecorator{
    VeggieTopping(BasePizza basePizza) {
        super(basePizza);

    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
