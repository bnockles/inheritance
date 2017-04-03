package inheritance;

public class MahinKhan extends Student{

	public MahinKhan() {
		super("Mahin", "Khan", 2017, Main.COMP_SCI_MAJOR);
	}
	
	@Override
	public void act(){
		System.out.println("Mahin Khan");
	}

}
