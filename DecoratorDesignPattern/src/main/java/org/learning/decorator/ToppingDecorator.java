package org.learning.decorator;

public abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;
    ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
