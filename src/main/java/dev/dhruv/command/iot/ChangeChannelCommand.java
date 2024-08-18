package dev.dhruv.command.iot;

public class ChangeChannelCommand implements ICommand {
    private final TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
