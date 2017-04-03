package inheritance;

public class SamSagawa extends Student {

	public SamSagawa() {
		super("Sam", "Sagawa", 2021, Main.COMP_SCI_MAJOR);
	}
	
	@Override
	public void act(){
		System.out.println("Sam Sagawa does, in fact, know what he's doing.");
		super.act();
	}

}
