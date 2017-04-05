package inheritance;

public class HunterZhao extends ClubMember {

	public HunterZhao() {
		super("Hunter", "Zhao", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act(){
		System.out.println("Hunter Zhao");
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i) instanceof ClubMember && ((ClubMember)Main.getAllStudents().get(i)).getClub().equals("roblox")){
				shakeHandsWith(Main.getAllStudents().get(i));
			}
		}
	}
}

