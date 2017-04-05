package inheritance;

public class IramShahed extends ClubMember {

	public IramShahed() {
		super("Iram", "Shahed", 2017, Main.COMP_SCI_MAJOR, "runescape");
	}
	public void act(){
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub() == this.getClub()){
				shakeHandsWith(s);
			}
		}
	}
}
