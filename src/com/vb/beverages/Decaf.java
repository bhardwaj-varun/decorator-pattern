package com.vb.beverages;

import com.vb.base.Beverage;
import com.vb.base.RateChart;

public class Decaf implements Beverage {
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return RateChart.DECAF_RATE;
    }
}
