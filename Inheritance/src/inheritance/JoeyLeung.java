package inheritance;

public class JoeyLeung extends Student {

	public JoeyLeung() {
		// TODO Auto-generated constructor stub
		super("Joey", "Leung", 2017, Main.COMP_SCI_MAJOR);
	}

	
	@Override
	public void act(){
		stateName();
	}

}
