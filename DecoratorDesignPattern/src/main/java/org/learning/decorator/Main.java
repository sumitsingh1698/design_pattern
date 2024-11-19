package org.learning.decorator;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello, World!");
        System.out.println(new VeggieTopping(new CheeseTopping(new TomatoPizza())).cost());
        ;
    }
}