package in.ineuron.command;

public class HeaterCommand implements Command {
	
	private Heater heater;

	public HeaterCommand(Heater heater) {
		super();
		this.heater = heater;
	}

	@Override
	public void execute() {
		heater.On();
	}

	@Override
	public void undo() {
		heater.Off();
	}

}
