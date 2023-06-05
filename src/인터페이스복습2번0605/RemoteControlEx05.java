package 인터페이스복습2번0605;
import java.util.Scanner;

public class RemoteControlEx05 {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new Audio();
        remoteControl.turnON();
        remoteControl.setVolume(102);
    }
}
