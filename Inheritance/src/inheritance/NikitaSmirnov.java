package inheritance;

public class NikitaSmirnov extends ClubMember {

	public NikitaSmirnov() {
		super("Nikita", "Smirnov", 2017, Main.COMP_SCI_MAJOR, "roblox");
	}
	
	public void act(){
		System.out.println("Nikita Smirnov");
		
		for(int i = 0; i < Main.getAllStudents().size(); i++){
			if(Main.getAllStudents().get(i) instanceof ClubMember) {
				if(((ClubMember) Main.getAllStudents().get(i)).getClub().equals(getClub())){
					shakeHandsWith(Main.getAllStudents().get(i));
				}
			}
		}
	}

}
