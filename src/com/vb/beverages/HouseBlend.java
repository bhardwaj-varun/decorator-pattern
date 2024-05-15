package com.vb.beverages;

import com.vb.base.RateChart;
import com.vb.base.Beverage;

public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return RateChart.HOUSE_BLEND_RATE;
    }
}
