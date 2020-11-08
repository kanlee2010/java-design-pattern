package AbstractFactory.frwk;

public interface BikeFactory {
    public Body createBody();
    public Wheel createWheel();
}