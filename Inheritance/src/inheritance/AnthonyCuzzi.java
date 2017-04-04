package inheritance;

public class AnthonyCuzzi extends ClubMember{
	
	public AnthonyCuzzi() {
		super("Anthony","Cuzzi",2017,new Major("Software","Computer Science"),"anime");
	}
	
	
	public void act(){
		System.out.println("Anthony Cuzzi a student");
		for(Student s :  Main.getAllStudents()){
			if(((ClubMember) s).getClub() == "K-Drama")
			shakeHandsWith(s);
		}
	}

}
