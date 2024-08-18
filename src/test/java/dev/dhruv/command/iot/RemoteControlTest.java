package dev.dhruv.command.iot;

import org.junit.jupiter.api.Test;

public class RemoteControlTest {

    @Test
    public void testRemoteControl() {
        // create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        //create command objects
        ICommand turnOnTvCommand = new TurnOnCommand(tv);
        ICommand turnOffTvCommand = new TurnOffCommand(tv);
        ICommand adjustVolumeCommand = new AdjustVolumeCommand(stereo);
        ICommand changeChannelCommand = new ChangeChannelCommand(tv);

        // create remote control
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnTvCommand);
        remoteControl.pressButton();

        assert tv.isOn();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();

        assert stereo.getVolume() == 50;

        int currentChannel = tv.getChannel();
        remoteControl.setCommand(changeChannelCommand);
        remoteControl.pressButton();

        assert currentChannel != tv.getChannel();

        remoteControl.setCommand(turnOffTvCommand);
        remoteControl.pressButton();

        assert !tv.isOn();
    }
}
