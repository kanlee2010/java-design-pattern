package Mediator;

public abstract class Colleague {
    private Mediator mediator;

    public boolean join(Mediator mediator) {
        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if (mediator != null)
            mediator.meiate(data);
    }

    public abstract void handle(String data);
}
