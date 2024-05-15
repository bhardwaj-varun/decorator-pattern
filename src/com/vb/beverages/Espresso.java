package com.vb.beverages;

import com.vb.base.Beverage;
import com.vb.base.RateChart;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return RateChart.ESPRESSO_RATE;
    }
}
