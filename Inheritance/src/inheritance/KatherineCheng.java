package inheritance;

public class KatherineCheng extends ClubMember {

	public KatherineCheng() {
		super("Katherine", "Cheng", 2017, Main.COMP_SCI_MAJOR, "k-drama");
	}
	
	public void act(){
		System.out.println("Katherine Cheng");
		for(Student s : Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub().equals("k-drama") && !s.getFirstName().equals("Katherine")){
				shakeHandsWith(s);
			}
		}
	}

}
