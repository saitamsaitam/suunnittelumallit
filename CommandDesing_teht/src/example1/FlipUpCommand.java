package example1;

/**
 * The Command for turning on the light - ConcreteCommand #1
 */
public class FlipUpCommand implements Command {
	
	
	private Valkokangas valkokangas;

	public FlipUpCommand(Valkokangas valkokangas) {
		
		this.valkokangas = valkokangas;
	}

	// Command
	@Override 
	public void execute() {
		valkokangas.up();
	}
}
