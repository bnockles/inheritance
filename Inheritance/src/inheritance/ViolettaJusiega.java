package inheritance;

public class ViolettaJusiega extends Student{
	
	public ViolettaJusiega(){
		super("Violetta", "Jusiega", 2017, Main.COMP_SCI_MAJOR);
	}
	
	@Override
	public void act(){
		System.out.println("Violetta Jusiega");
	}
	
}
