package AbstractFactory.impl;

import AbstractFactory.frwk.BikeFactory;
import AbstractFactory.frwk.Body;
import AbstractFactory.frwk.Wheel;

public class Main {
  public static void main(String[] args) {
    BikeFactory factory = new SamFactory();
    Body body = factory.createBody();
    Wheel wheel = factory.createWheel();

    System.out.println(body.getClass());
    System.out.println(wheel.getClass());

    factory = new GtFactory();
    body = factory.createBody();
    wheel = factory.createWheel();

    System.out.println(body.getClass());
    System.out.println(wheel.getClass());
  }
}
