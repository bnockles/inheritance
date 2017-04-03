package inheritance;

public class JosephHur extends Student {
	
	public JosephHur(){
		super("Joseph", "Hur", 2017, Main.COMP_SCI_MAJOR);
	}
	
	@Override
	public void act(){
		stateName();
	}
}
