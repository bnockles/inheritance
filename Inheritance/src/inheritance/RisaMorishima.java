package inheritance;

public class RisaMorishima extends ClubMember{

	public RisaMorishima() {
		super("Risa", "Morishima", 2017, Main.COMP_SCI_MAJOR, "break dance");
	}

	public void act(){
		System.out.println("Risa Morishima");
		
		for(Student s : Main.getAllStudents()){
			ClubMember member = (ClubMember) s;
			
			if(member.getClub().equals("break dance"))
				shakeHandsWith(s);
			
		}
		
	}
	
}
