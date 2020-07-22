package com.nishantpant.cabbooking.strategies;

import com.nishantpant.cabbooking.model.Cab;
import com.nishantpant.cabbooking.model.Location;
import com.nishantpant.cabbooking.model.Rider;

import java.util.List;

public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
