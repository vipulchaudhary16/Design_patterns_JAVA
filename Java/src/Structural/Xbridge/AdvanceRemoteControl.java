package Structural.Xbridge;

public class AdvanceRemoteControl extends RemoteControl{

    AdvanceRemoteControl(Device device) {
        super(device);
    }

    void mute(){
        device.setVolume(0);
    }
}
