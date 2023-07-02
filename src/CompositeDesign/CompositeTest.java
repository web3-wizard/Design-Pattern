package CompositeDesign;

public class CompositeTest {

	public static void main(String[] args) {
		
		Component ssd = new Leaf(6000, "SSD");
		Component mouse = new Leaf(700, "Mouse");
		Component monitor = new Leaf(16000, "Monitor");
		Component ram = new Leaf(10000, "Ram");
		Component cpu = new Leaf(17000, "CPU");
		
		Composite peri = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		peri.addComponent(mouse);
		peri.addComponent(monitor);
		
		cabinet.addComponent(ssd);
		cabinet.addComponent(mb);
		
		computer.addComponent(peri);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		
	}

}
