package com.nishantpant.cabbooking.strategies;

import com.nishantpant.cabbooking.model.Location;

public interface PricingStrategy {
  Double findPrice(Location fromPoint, Location toPoint);
}
