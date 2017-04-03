package inheritance;

public class ZhenXiao extends Student {

	public ZhenXiao() {
		super("Zhen", "Xiao", 2017, Main.COMP_SCI_MAJOR);
	}

	@Override
	public void act(){
		stateName();
		stateMajor();
		stateStatus();
	}
	
	@Override
	public void stateName(){
		System.out.print("\nMy name is "+getFirstName()+" "+getLastName()+" but you can call me Alan! ");
	}
}
