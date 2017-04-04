package inheritance;

public class JoyceFeng extends ClubMember {

	public JoyceFeng() {
		super("Joyce", "Feng", 2021, Main.COMP_SCI_MAJOR, "k-drama");
	}

	public void act(){
		System.out.print("Joyce Feng");
		System.out.print("I'm having a blast.");
	}
}
