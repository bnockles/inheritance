package inheritance;

public class HunterZhao extends ClubMember {

	public HunterZhao() {
		super("Hunter", "Zhao", 2017, Main.COMP_SCI_MAJOR, "minecraft");
	}
	
	public void act(){
		System.out.println("Hunter Zhao");
	}
}

