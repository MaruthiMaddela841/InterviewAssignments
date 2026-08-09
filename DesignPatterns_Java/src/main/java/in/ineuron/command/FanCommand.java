package in.ineuron.command;

public class FanCommand implements Command {
	private Fan fan;
	
	
	public FanCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.On();
	}

	@Override
	public void undo() {
		fan.Off();
	}

}
