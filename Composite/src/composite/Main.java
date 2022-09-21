package composite;

import computerParts.Case;
import computerParts.GraphicsCard;
import computerParts.Memory;
import computerParts.Motherboard;
import computerParts.Nic;
import computerParts.Processor;

public class Main {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		
		Case case1 = new Case(20);
		GraphicsCard gc1 = new GraphicsCard(400);
		Memory memory1 = new Memory(100);
		Motherboard mb1 = new Motherboard(150);
		Nic nic1 = new Nic(50);
		Processor proc1 = new Processor(250);
		
		
		computer1.addPart(case1);
		computer1.addPart(gc1);
		computer1.addPart(memory1);
		computer1.addPart(mb1);
		computer1.addPart(nic1);
		computer1.addPart(proc1);
		
		System.out.println(computer1.getPrice());

	}

}
