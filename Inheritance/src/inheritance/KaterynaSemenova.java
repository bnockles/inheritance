package inheritance;

public class KaterynaSemenova extends Student {

	public KaterynaSemenova(){
		super("Kat","Semenova", 2012, Main.COMP_SCI_MAJOR);
	}
	
	public void act(){
		stateName();
		stateStatus();
	}
}
