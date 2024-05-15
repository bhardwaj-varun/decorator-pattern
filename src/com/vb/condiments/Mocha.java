package com.vb.condiments;

import com.vb.base.RateChart;
import com.vb.base.Beverage;
import com.vb.base.Condiments;

public class Mocha implements Condiments {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return RateChart.MOCHA_RATE + beverage.cost();
    }
}
