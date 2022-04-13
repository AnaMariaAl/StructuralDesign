package com.company.DecoratorPattern;

public class Topping extends CoffeeDecorator{

    public Coffee coffee;

    public Topping(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public int cost() {
        return this.coffee.cost()+ Constants.TOPPING;
    }
}
