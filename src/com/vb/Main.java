package com.vb;

import com.vb.base.Beverage;
import com.vb.beverages.Decaf;
import com.vb.beverages.HouseBlend;
import com.vb.condiments.Mocha;
import com.vb.condiments.Soy;
import com.vb.condiments.SteamedMilk;
import com.vb.condiments.Whip;

public class Main {
    public static void main(String[] args) {
        // order double mocha soy whipped on house blend
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println("Order : "+ beverage.getDescription()+", Price: $"+beverage.cost());

        //order SteamedMilk double whip decaf with double soy

        Beverage decaf = new Decaf();
        decaf = new SteamedMilk(decaf);
        decaf = new SteamedMilk(decaf);
        decaf = new Soy(decaf);
        decaf = new Soy(decaf);
        decaf = new Whip(decaf);
        System.out.println("Order : "+ decaf.getDescription()+", Price: $"+String.format("%.2f", decaf.cost()));


    }
}