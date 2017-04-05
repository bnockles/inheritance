package inheritance;

public class AfsanaChadni extends ClubMember {

	public AfsanaChadni() {
		super("Afsana", "Chadni", 2017, Main.COMP_SCI_MAJOR, "pokemon");
	}

	public void act() {
		System.out.print("Afsana Chadni");
		for (int i = 0; i < Main.getAllStudents().size(); i++) {
			if (Main.getAllStudents().get(i) instanceof ClubMember
					&& ((ClubMember) (Main.getAllStudents().get(i))).getClub().equals("pokemon")
					&& Main.getAllStudents().get(i) != this) {
				shakeHandsWith(Main.getAllStudents().get(i));
			}
		}
	}
	
	public void run(){
		while(true){
			for(Student s: Main.getAllStudents()){
				if(s instanceof NetworkAdministrator){
					s.restore();
				}
				
				if(s  instanceof Hacker){
					Hacker hacker = (Hacker) s;
					hacker.createPatch();
				}
			}
		}
	}
}
