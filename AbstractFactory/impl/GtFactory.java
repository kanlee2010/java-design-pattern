package AbstractFactory.impl;

import AbstractFactory.frwk.BikeFactory;
import AbstractFactory.frwk.Body;
import AbstractFactory.frwk.Wheel;

public class GtFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
    
}
