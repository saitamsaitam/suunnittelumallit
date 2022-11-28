package facade;



public class ComputerFacade {

	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	private long kBootAddress = 5000;
	
	private long kBootSector = 4000;
	
	private int kSectorSize = 5;
	
	
	public ComputerFacade(CPU cpu, Memory m, HardDrive hd) {
		
		this.cpu = cpu;
		this.memory = m;
		this.hardDrive = hd;
	}
	
	
	public void start() {
		
		cpu.Freeze();
		memory.Load(kBootAddress, hardDrive.Read(kBootSector, kSectorSize));
		cpu.Jump(kBootAddress);
		cpu.Execute();
		
	}
	
}
