package inheritance;

public class MatthewYarmolinsky extends Student{

	public MatthewYarmolinsky() {
		super("Matthew", "Yarmolinsky", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
		System.out.print("Matthew Yarmolinsky");
	}

}
