package com.company.DecoratorPattern;

public class Milk extends CoffeeDecorator{

    private Coffee coffee;

    public Milk(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public int cost() {
        return this.coffee.cost()+ Constants.MILK;
    }
}
