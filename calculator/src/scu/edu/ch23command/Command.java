package scu.edu.ch23command;

public abstract class Command {
	
	protected Barbecuer receiver;

	public Command(Barbecuer receiver) {
		super();
		this.receiver = receiver;
	}
	
	public abstract void ExecuteCommand();

}
