package inheritance;

public class AlexHuang extends ClubMember{

	public AlexHuang() {
		super("Alex","Huang",2017,Main.COMP_SCI_MAJOR,"runescape");
	}
	public void act(){
		System.out.println("Alex Huang");
		for(Student i: Main.getAllStudents()){
			if (((ClubMember) i).getClub().equals("runescape")){
				shakeHandsWith(i);
				//
		}
	}
}
}
