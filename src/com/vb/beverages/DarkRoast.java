package com.vb.beverages;

import com.vb.base.RateChart;
import com.vb.base.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return RateChart.DARK_ROAST_RATE;
    }
}
