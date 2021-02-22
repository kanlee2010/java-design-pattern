package Mediator;

import java.util.ArrayList;

public abstract class Mediator {

    protected ArrayList<Colleague> colleagues;

    protected Mediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public boolean addColleague(Colleague colleague) {
        return colleagues.add(colleague);
    }

    abstract void meiate(String data);
}
