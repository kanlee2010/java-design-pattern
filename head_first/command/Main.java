package head_first.command;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

        RemoteControl rc = new RemoteControl();
        LightOffCommand lightOff = new LightOffCommand(light);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
        rc.setCommand(0, lightOn, lightOff);
        rc.setCommand(1, garageOpen, garageClose);

        System.out.println(rc);

        rc.onButtonWasPushed(0);
        rc.offButtonWasPushed(0);
        rc.onButtonWasPushed(1);
        rc.offButtonWasPushed(1);
        rc.undoButtonWasPushed();
    }
}
