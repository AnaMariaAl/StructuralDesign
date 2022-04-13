package com.company.DecoratorPattern;

public class Americano implements Coffee{

    @Override
    public int cost() {
        return Constants.COFFEE_COST;
    }
}
