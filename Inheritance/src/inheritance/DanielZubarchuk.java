package inheritance;

public class DanielZubarchuk extends Student{

	public DanielZubarchuk() {
		super("Daniel", "Zubarchuk", 2017, Main.COMP_SCI_MAJOR);
	}

	public void act(){
		stateName();
		stateStatus();
	}
}
