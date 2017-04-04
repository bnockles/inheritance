package inheritance;

public class MichaelLi extends Student {

	public MichaelLi() {
		super("Michael","Li", 2017, Main.COMP_SCI_MAJOR);
	}

	public void act(){
		stateName();
		stateMajor();
		stateStatus();
		System.out.println("Hi. Penguins are cool.");
	}
}
