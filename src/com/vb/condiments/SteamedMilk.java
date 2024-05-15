package com.vb.condiments;

import com.vb.base.RateChart;
import com.vb.base.Beverage;
import com.vb.base.Condiments;

public class SteamedMilk implements Condiments {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return RateChart.STEAMED_MILK_RATE + beverage.cost();
    }
}
