package AbstractFactory.impl;

import AbstractFactory.frwk.BikeFactory;
import AbstractFactory.frwk.Body;
import AbstractFactory.frwk.Wheel;

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
