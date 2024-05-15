package com.vb.condiments;

import com.vb.base.RateChart;
import com.vb.base.Beverage;
import com.vb.base.Condiments;

public class Soy implements Condiments {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return RateChart.SOY_RATE +  beverage.cost();
    }
}
