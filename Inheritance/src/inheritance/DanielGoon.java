package inheritance;

public class DanielGoon extends ClubMember implements Hacker{
	public DanielGoon(){
		super("Daniel","Goon",2017,Main.COMP_SCI_MAJOR,"minecraft");
	}
	public void act(){
		System.out.println(getFirstName() +" "+ getLastName());
		for(Student s: Main.getAllStudents()){
			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub()) 
					&& s != this){
				shakeHandsWith(s);
			}
		}
	}
	public void run(){
		for(Student s: Main.getAllStudents()){
			if(s instanceof Hacker){
				s.mutate();
			}
			else{
				s.corrupt();
			}
		}
	}
//	public void shakeClubMember(){
//		for(Student s: Main.getAllStudents()){
//			if(s instanceof ClubMember && ((ClubMember) s).getClub().equals(getClub())){
//				shakeHandsWith(s);
//			}
//		}
//	}
}
