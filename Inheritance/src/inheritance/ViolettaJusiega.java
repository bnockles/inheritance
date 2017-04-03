package inheritance;

public class ViolettaJusiega extends ClubMember{
	
	public ViolettaJusiega(){
		super("Violetta", "Jusiega", 2017, Main.COMP_SCI_MAJOR, "music");
	}
	
	@Override
	public void act(){
		System.out.println("My name is Violetta Jusiega.");
	}
	
}
