package inheritance;

public class IramShahed extends ClubMember implements Hacker{

	public IramShahed() {
		super("Iram", "Shahed", 2017, Main.COMP_SCI_MAJOR, "runescape");
	}
	public void act(){
		for(Student s: Main.getAllStudents()){
			ClubMember c = (ClubMember) s;
			if(c.getClub().equals(this.getClub()) && c.getFirstName() != this.getFirstName()){
				shakeHandsWith(s);
			}
		}
	}
	public void run(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Hacker && !s.isAlive()){
				s.mutate();
			}
			else{
				s.corrupt();
			}
		}
	}
}
