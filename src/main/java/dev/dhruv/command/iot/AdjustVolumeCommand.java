package dev.dhruv.command.iot;

public class AdjustVolumeCommand implements ICommand {
    private final Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
