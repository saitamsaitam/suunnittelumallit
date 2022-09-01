package factorymethod;

public class Kannilainen extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		return new Olut();
	}

}
