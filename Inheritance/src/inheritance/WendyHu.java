package inheritance;

public class WendyHu extends Student {

	public WendyHu() {
		// TODO Auto-generated constructor stub
		super("Wendy","Hu",2021,Main.COMP_SCI_MAJOR);
	}
	
	@Override 
	public void act(){
		stateName();
	}

}
  