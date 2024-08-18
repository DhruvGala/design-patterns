package dev.dhruv.command.iot;

/**
 * Concrete command for turning a device off.
 */
public class TurnOffCommand implements ICommand {
    private final IDevice device;

    public TurnOffCommand(IDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
