package example1;

/**
 * The Command for turning off the light - ConcreteCommand #2
 */
public class FlipDownCommand implements Command {
	
	private Valkokangas valkokangas;

	public FlipDownCommand(Valkokangas valkokangas) {
		
		this.valkokangas = valkokangas;
	}

	@Override // Command
	public void execute() {
		valkokangas.down();
	}
}
