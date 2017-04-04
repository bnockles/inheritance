package inheritance;

public class MatthewYarmolinsky extends ClubMember{

	public MatthewYarmolinsky() {
		super("Matthew", "Yarmolinsky", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}
	
	public void act(){
		System.out.print("Matthew Yarmolinsky");
	}

}
