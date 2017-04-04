package inheritance;

public class MatthewNguyen extends Student {

	public MatthewNguyen(String name, String surname, int gradClass, Major major) {
		super("Matthew", "Nguyen", 2017, Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
		System.out.println("Matthew Nguyen");
	}
}
