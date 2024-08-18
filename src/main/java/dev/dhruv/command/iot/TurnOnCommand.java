package dev.dhruv.command.iot;

/**
 * Concrete command for turning a device on.
 */
public class TurnOnCommand implements ICommand {
    private final IDevice device;

    public TurnOnCommand(IDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
