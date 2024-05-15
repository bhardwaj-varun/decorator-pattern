package com.vb.condiments;

import com.vb.base.RateChart;
import com.vb.base.Beverage;
import com.vb.base.Condiments;

public class Whip implements Condiments {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Whip";
    }

    @Override
    public double cost() {
        return RateChart.WHIP_RATE + beverage.cost();
    }
}
