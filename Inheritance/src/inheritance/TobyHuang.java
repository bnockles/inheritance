package inheritance;

public class TobyHuang extends ClubMember {

	public TobyHuang() {
		super("Toby","Huang",2010,Main.COMP_SCI_MAJOR,"anime");
	}
	
	public void act(){
		System.out.println("Toby Huang is alive");
		for(Student s: Main.getAllStudents()){
			if(((ClubMember) s).getClub().equals(getClub())){
				shakeHandsWith(s);
			}
		}
	}

}
