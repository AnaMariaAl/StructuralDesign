package com.company.DecoratorPattern;

public class Client {
    public  static void main(String[] args) {

        Coffee coffee = new Americano();
        int totalCost = coffee.cost();
        System.out.println(totalCost);


        Coffee coffee1 = new Milk(new Americano());
        System.out.println(coffee1.cost());


        Coffee coffee2 = new Topping(new Milk(new Americano()));
        System.out.println(coffee2.cost());
    }
}
