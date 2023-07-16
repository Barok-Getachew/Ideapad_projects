import java.awt.*;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();

        Command LightOnCommand   = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Turn on the light

        remote.setCommand(LightOnCommand);

        remote.pressButton();




//        // Turn off the light
//        remote.setCommand(lightOffCommand);
//        remote.pressButton();
    }
    }
