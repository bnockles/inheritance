package inheritance;

public class VeerajJethalal extends Student{

	public VeerajJethalal() {
		super("Veeraj", "Jethalal", 2017, Main.COMP_SCI_MAJOR);
	}
	
	@Override
	public void act(){
		stateName();
	}

}
